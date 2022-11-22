package pe.edu.upc.helpmefast.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.helpmefast.entities.Comentarios;
import pe.edu.upc.helpmefast.entities.Distrito;
import pe.edu.upc.helpmefast.serviceinterfaces.IComentariosService;
import pe.edu.upc.helpmefast.serviceinterfaces.IDistritoService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/comentarios")
public class ComentarioController {

    @Autowired
    private IComentariosService cService;

    @PostMapping
    public void registrar(@RequestBody Comentarios c) { cService.insert(c); }

    @GetMapping
    public List<Comentarios> listar(){
        return cService.list();}

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id) {
        cService.delete(id); }

    @PutMapping
    public void actualizar(@RequestBody Comentarios c) { cService.insert(c); }

    @PostMapping("/buscar")
    public List<Comentarios> buscar(@RequestBody Comentarios c) { return cService.search(c.getNumCalificacion());}

    @GetMapping("/{id}")
    public Optional<Comentarios> listarId(@PathVariable("id") Integer id) {
        return cService.listarId(id);
    }
}