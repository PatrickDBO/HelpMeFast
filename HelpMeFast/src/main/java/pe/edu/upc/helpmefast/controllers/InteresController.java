package pe.edu.upc.helpmefast.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.helpmefast.entities.Interes;
import pe.edu.upc.helpmefast.entities.ResultadoAngello;
import pe.edu.upc.helpmefast.entities.Resultadonivelalto;
import pe.edu.upc.helpmefast.entities.Servicios;
import pe.edu.upc.helpmefast.serviceinterfaces.IInteresService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/interes")
public class InteresController {

    @Autowired
    private IInteresService iService;

    @PostMapping
    public void registrar(@RequestBody Interes i) {iService.insert(i);}
    @GetMapping
    public List<Interes> listar() {
        return iService.list();
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){iService.delete(id);}
    @PutMapping
    public void actualizar(@RequestBody Interes i) {iService.insert(i);}
    @PostMapping("/buscar")
    public List<Interes> buscar(@RequestBody Interes i){
        return iService.search(i.getLevelInteres());
    }

    @GetMapping("/{id}")
    public Optional<Interes> listarId(@PathVariable("id") Integer id) {
        return iService.listarId(id);
    }

    @GetMapping("/nivelaltopacienteservicio")
    public List<Resultadonivelalto> interesAltoPaciente(){
        return iService.interesAltoPaciente();
    }

    @GetMapping("/buscarnivel")
    public List<Interes> buscarLevel(){
        return iService.buscarNivel();
    }

    @GetMapping("/cantidadAnuncio")
    public List<ResultadoAngello> buscarCantidadAnuncios(){
        return iService.buscarCantidadAnuncios();
    }
}

