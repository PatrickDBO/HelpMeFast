package pe.edu.upc.helpmefast.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.helpmefast.entities.Distrito;
import pe.edu.upc.helpmefast.serviceinterfaces.IDistritoService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/distritos")
public class DistritoController {

    @Autowired
    private IDistritoService dService;

    @PostMapping
    public void registrar(@RequestBody Distrito d) { dService.insert(d); }

    @GetMapping
    public List<Distrito> listar(){
        return dService.list();}

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id) {
        dService.delete(id); }

    @PutMapping
    public void actualizar(@RequestBody Distrito d) { dService.insert(d); }

    @PostMapping("/buscar")
    public List<Distrito> buscar(@RequestBody Distrito d) { return dService.search(d.getNameDistrito());}

    @GetMapping("/{id}")
    public Optional<Distrito> listarId(@PathVariable("id") Integer id) {
        return dService.listarId(id);
    }
}
