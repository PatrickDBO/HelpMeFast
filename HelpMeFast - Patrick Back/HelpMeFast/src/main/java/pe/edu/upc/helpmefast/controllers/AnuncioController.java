package pe.edu.upc.helpmefast.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.helpmefast.entities.Anuncio;
import pe.edu.upc.helpmefast.serviceinterfaces.IAnuncioService;

import java.util.List;
import java.util.Optional;

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
    public List<Anuncio> buscar(@RequestBody Anuncio a){return aService.search(a.getServicio().getDescServicios());}

    @GetMapping("/{id}")
    public Optional<Anuncio> listarId(@PathVariable("id") Integer id) {
        return aService.listarId(id);
    }
}

