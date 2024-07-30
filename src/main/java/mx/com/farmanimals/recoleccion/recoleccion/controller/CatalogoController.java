package mx.com.farmanimals.recoleccion.recoleccion.controller;

import mx.com.farmanimals.recoleccion.recoleccion.service.CatalogoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/catalogo")
public class CatalogoController {

    @Autowired
    private CatalogoService catalogoService;

    @GetMapping("/buscaClientes")
    public ResponseEntity<String> buscaClientes(@RequestParam String username, @RequestParam String password, @RequestParam(required = false) Integer id) {
        return catalogoService.buscaClientes(username, password, id);
    }

    @GetMapping("/buscaSucursales")
    public ResponseEntity<String> buscaSucursales(@RequestParam String username, @RequestParam String password, @RequestParam(required = false) Integer id) {
        return catalogoService.buscaSucursales(username, password, id);
    }

    @GetMapping("/buscaCortes")
    public ResponseEntity<String> buscaCortes(@RequestParam String username, @RequestParam String password, @RequestParam Integer id, @RequestParam String fechaCorte) {
        return catalogoService.buscaCortes(username, password, id, fechaCorte);
    }
}
