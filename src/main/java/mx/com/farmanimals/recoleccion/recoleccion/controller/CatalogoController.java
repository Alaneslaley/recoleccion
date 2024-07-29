package mx.com.farmanimals.recoleccion.recoleccion.controller;

import mx.com.farmanimals.recoleccion.recoleccion.service.CatalogoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/catalogos")
public class CatalogoController {

    @Autowired
    private CatalogoService catalogoService;

    @GetMapping("/busca_cliente")
    public ResponseEntity<String> buscaClientes(@RequestParam(required = false) Integer id) {
        return catalogoService.buscaClientes(id);
    }

    @GetMapping("/busca_sucursales")
    public ResponseEntity<String> buscaSucursales(@RequestParam(required = false) Integer id) {
        return catalogoService.buscaSucursales(id);
    }

    @GetMapping("/busca_cortes")
    public ResponseEntity<String> buscaCortes(@RequestParam Integer id, @RequestParam String fechaCorte) {
        return catalogoService.buscaCortes(id, fechaCorte);
    }
}
