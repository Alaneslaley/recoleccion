package mx.com.farmanimals.recoleccion.recoleccion.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

@Service
public class CatalogoService {

    @Value("${api.url}")
    private String apiUrl;

    @Value("${api.key}")
    private String apiKey;

    @Autowired
    private RestTemplate restTemplate;

    private HttpHeaders createHeaders(String username, String password) {
        String auth = username + ":" + password;
        String encodedAuth = Base64.getEncoder().encodeToString(auth.getBytes(StandardCharsets.UTF_8));

        HttpHeaders headers = new HttpHeaders();
        headers.set("Authorization", "Basic " + encodedAuth);
        headers.set("x-api-key", apiKey);
        return headers;
    }

    public ResponseEntity<String> buscaClientes(String username, String password, Integer id) {
        String url = apiUrl + "busca_cliente";
        if (id != null) {
            url += "?id=" + id;
        }
        HttpEntity<String> entity = new HttpEntity<>(createHeaders(username, password));
        return restTemplate.exchange(url, HttpMethod.GET, entity, String.class);
    }

    public ResponseEntity<String> buscaSucursales(String username, String password, Integer id) {
        String url = apiUrl + "busca_sucursales";
        if (id != null) {
            url += "?id=" + id;
        }
        HttpEntity<String> entity = new HttpEntity<>(createHeaders(username, password));
        return restTemplate.exchange(url, HttpMethod.GET, entity, String.class);
    }

    public ResponseEntity<String> buscaCortes(String username, String password, Integer id, String fechaCorte) {
        String url = apiUrl + "busca_cortes?id=" + id + "&fechaCorte=" + fechaCorte;
        HttpEntity<String> entity = new HttpEntity<>(createHeaders(username, password));
        return restTemplate.exchange(url, HttpMethod.GET, entity, String.class);
    }
}
