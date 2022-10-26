package pe.edu.upc.helpmefastspring.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.helpmefastspring.entities.Anuncio;
import pe.edu.upc.helpmefastspring.serviceinterfaces.IAnuncioService;

import java.util.List;

@RestController
@RequestMapping("/anuncios")
public class AnuncioController {
    @Autowired
    private IAnuncioService aService;

    @PostMapping
    public void registrar(@RequestBody Anuncio a ){aService.insert(a);}

    @GetMapping
    public List<Anuncio> listar(){return aService.list();}

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id")Integer id){aService.delete(id);}

    @PutMapping
    public void actualizar(@RequestBody Anuncio a){aService.insert(a);}

    @PostMapping("/buscar")
    public List<Anuncio> buscar(@RequestBody Anuncio a){return aService.search(a.getServicio());}
}
