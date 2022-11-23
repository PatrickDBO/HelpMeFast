package pe.edu.upc.helpmefast.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.helpmefast.entities.Interes;
import pe.edu.upc.helpmefast.entities.Servicios;
import pe.edu.upc.helpmefast.serviceinterfaces.IServiciosService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/servicios")
public class ServiciosController {
    @Autowired
    private IServiciosService sService;
    @PostMapping
    private void registrar(@RequestBody Servicios s){sService.insert(s);}
    @GetMapping
    public List<Servicios> listar(){return sService.list();}
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id")Integer id){sService.delete(id);}
    @PutMapping
    public void actualizar(@RequestBody Servicios s){sService.insert(s);}
    @PostMapping("/buscar")
    public List<Servicios>buscar(@RequestBody Servicios s){return sService.search(s.getDescServicios());}

    @GetMapping("/{id}")
    public Optional<Servicios> listarId(@PathVariable("id") Integer id) {
        return sService.listarId(id);
    }
}
