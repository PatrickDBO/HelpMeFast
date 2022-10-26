package pe.edu.upc.demoservicios.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.demoservicios.entities.Servicios;
import pe.edu.upc.demoservicios.serviceinterfaces.IServiciosService;

import java.util.List;

@RestController
@RequestMapping("/servicios")
public class ServiciosController {
    @Autowired
    private IServiciosService sService;
    @PostMapping
    private void registrar(@RequestBody Servicios s){sService.insert(s);}
    @GetMapping
    public List<Servicios>listar(){return sService.list();}
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id")Integer id){sService.delete(id);}
    @PutMapping
    public void actualizar(@RequestBody Servicios s){sService.insert(s);}
    @PostMapping("/buscar")
    public List<Servicios>buscar(@RequestBody Servicios s){return sService.search(s.getDescServicios());}
}
