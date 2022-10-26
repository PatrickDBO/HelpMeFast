package pe.edu.upc.enfermero.enfermerointerfaces;

import pe.edu.upc.enfermero.entities.Enfermero;

import java.util.List;

public interface IEnfermeroService {
    void insert(Enfermero enfermero);

    List<Enfermero> list();

    void delete(int idEnfermero);

    List<Enfermero> search(String nameEnfermero);
}
