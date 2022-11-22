package pe.edu.upc.helpmefast.serviceinterfaces;

import pe.edu.upc.helpmefast.entities.Enfermero;

import java.util.List;
import java.util.Optional;

public interface IEnfermeroService {
    void insert(Enfermero enfermero);
    List<Enfermero> list();
    void delete(int idEnfermero);
    Optional<Enfermero> listarId(int idEnfermero);
    List<Enfermero> search(String nameEnfermero);
}
