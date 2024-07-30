package mx.com.farmanimals.recoleccion.recoleccion.controller;

import mx.com.farmanimals.recoleccion.recoleccion.model.ExternalUserResponse;
import mx.com.farmanimals.recoleccion.recoleccion.model.Usuario;
import mx.com.farmanimals.recoleccion.recoleccion.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import java.util.Base64;
import java.util.List;
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

        // Agregar autenticación básica usando email y password recibidos
        String auth = usuario.getEmail() + ":" + usuario.getPassword(); // Usar el email y password recibidos
        String encodedAuth = Base64.getEncoder().encodeToString(auth.getBytes());
        String authHeader = "Basic " + encodedAuth;
        headers.set("Authorization", authHeader);

        // Crear el cuerpo de la solicitud
        String requestBody = String.format("{\"id\": \"%s\"}", usuario.getEmail());

        HttpEntity<String> request = new HttpEntity<>(requestBody, headers);

        try {
            logger.info("Enviando solicitud a la API externa con el cuerpo: " + requestBody);

            // Hacer la solicitud POST a la API externa
            ResponseEntity<ExternalUserResponse> response = restTemplate.exchange(
                    url, HttpMethod.POST, request, ExternalUserResponse.class);

            // Log de la respuesta de la API externa
            logger.info("Respuesta de la API externa: " + response.getStatusCode());
            logger.info("Cuerpo de la respuesta de la API externa: " + response.getBody());

            // Verificar la respuesta de la API externa
            if (response.getStatusCode() == HttpStatus.OK && response.getBody() != null) {
                ExternalUserResponse externalUser = response.getBody();

                // Logs adicionales para verificar los valores
                logger.info("Usuario activo: " + externalUser.isEstaActivo());
                logger.info("Nombre de usuario: " + externalUser.getNombreUsuario());

                if (externalUser.isEstaActivo()) {
                    // Aquí puedes procesar la respuesta según sea necesario
                    return ResponseEntity.ok(externalUser);
                } else {
                    return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Usuario no activo.");
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
}
