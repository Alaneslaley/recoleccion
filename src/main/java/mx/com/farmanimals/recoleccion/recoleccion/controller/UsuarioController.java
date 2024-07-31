package mx.com.farmanimals.recoleccion.recoleccion.controller;

import mx.com.farmanimals.recoleccion.recoleccion.model.ExternalUserResponse;
import mx.com.farmanimals.recoleccion.recoleccion.model.Usuario;
import mx.com.farmanimals.recoleccion.recoleccion.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import java.util.Base64;
import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;

@RestController
@RequestMapping("/api/usuario")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @Autowired
    private RestTemplate restTemplate;

    @Value("${api.url}")
    private String apiUrl;

    @Value("${api.key}")
    private String apiKey;

    private static final Logger logger = Logger.getLogger(UsuarioController.class.getName());

    @GetMapping
    public List<Usuario> obtenerTodos() {
        return usuarioService.obtenerTodos();
    }

    @PostMapping
    public Usuario guardar(@RequestBody Usuario usuario) {
        return usuarioService.guardar(usuario);
    }

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody Usuario usuario) {
        // Crear la URL completa para la API externa
        String url = apiUrl + "busca_usuario";

        // Crear los headers de la solicitud
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.set("x-api-key", apiKey);

        // Agregar autenticación básica usando clvusuario y password recibidos
        String auth = usuario.getEmail() + ":" + usuario.getPassword(); // Usar el clvusuario y password recibidos
        String encodedAuth = Base64.getEncoder().encodeToString(auth.getBytes());
        String authHeader = "Basic " + encodedAuth;
        headers.set("Authorization", authHeader);

        // Crear el cuerpo de la solicitud
        String requestBody = String.format("{\"id\": \"%s\"}", usuario.getEmail());

        HttpEntity<String> request = new HttpEntity<>(requestBody, headers);

        try {
            logger.info("Enviando solicitud a la API externa con el cuerpo: " + requestBody);

            // Hacer la solicitud POST a la API externa esperando una lista de ExternalUserResponse
            ResponseEntity<List<ExternalUserResponse>> response = restTemplate.exchange(
                    url, HttpMethod.POST, request, new ParameterizedTypeReference<List<ExternalUserResponse>>() {});

            // Log de la respuesta de la API externa
            logger.info("Respuesta de la API externa: " + response.getStatusCode());
            logger.info("Cuerpo de la respuesta de la API externa: " + response.getBody());

            // Verificar la respuesta de la API externa
            if (response.getStatusCode() == HttpStatus.OK && response.getBody() != null) {
                List<ExternalUserResponse> externalUsers = response.getBody();

                // Filtrar el usuario con el clvusuario proporcionado
                Optional<ExternalUserResponse> matchedUser = externalUsers.stream()
                        .filter(user -> user.getClvUsuario().equalsIgnoreCase(usuario.getEmail()))
                        .findFirst();

                if (matchedUser.isPresent()) {
                    ExternalUserResponse externalUser = matchedUser.get();

                    // Logs adicionales para verificar los valores
                    logger.info("Usuario activo: " + externalUser.isEstaActivo());
                    logger.info("Nombre de usuario: " + externalUser.getNombreUsuario());

                    if (externalUser.isEstaActivo()) {
                        // Obtener el tipo de usuario basado en el puesto
                        String userType = getUserType(externalUser.getClvPuesto().getDescripcion());
                        if (userType == null) {
                            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Tipo de usuario no reconocido.");
                        }
                        
                        // Crear una respuesta con el tipo de usuario y otros detalles necesarios
                        LoginResponse loginResponse = new LoginResponse(externalUser.getClvUsuario(), userType, externalUser.getNombreUsuario());
                        return ResponseEntity.ok(loginResponse);
                    } else {
                        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Usuario no activo.");
                    }
                } else {
                    return ResponseEntity.status(HttpStatus.NOT_FOUND).body("No se encontró el usuario.");
                }
            } else {
                return ResponseEntity.status(response.getStatusCode()).body(response.getBody());
            }
        } catch (HttpClientErrorException e) {
            // Log de la respuesta de error
            logger.severe("Error al llamar a la API externa: " + e.getMessage());
            logger.severe("Cuerpo del error: " + e.getResponseBodyAsString());
            return ResponseEntity.status(e.getStatusCode()).body(e.getResponseBodyAsString());
        }
    }

    private String getUserType(String puesto) {
        switch (puesto.toUpperCase()) {
            case "GERENTE":
                return "gerente";
            case "AUDITOR":
                return "auditor";
            case "MENSAJE":
                return "mensaje";
            case "RECOLECTOR":
                return "recolector";
            default:
                return null;
        }
    }

    private static class LoginResponse {
        private String clvusuario;
        private String puesto;
        private String nombreUsuario;

        public LoginResponse(String clvusuario, String puesto, String nombreUsuario) {
            this.clvusuario = clvusuario;
            this.puesto = puesto;
            this.nombreUsuario = nombreUsuario;
        }

        public String getClvusuario() {
            return clvusuario;
        }

        public String getUserType() {
            return puesto;
        }

        public String getNombreUsuario() {
            return nombreUsuario;
        }
    }
}
