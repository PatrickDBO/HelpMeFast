package pe.edu.upc.helpmefast.serviceinterfaces;

import pe.edu.upc.helpmefast.entities.Enfermero;
import pe.edu.upc.helpmefast.entities.ResultadoPatrick;

import java.util.List;
import java.util.Optional;

public interface IEnfermeroService {
    void insert(Enfermero enfermero);
    List<Enfermero> list();
    void delete(int idEnfermero);
    public Optional<Enfermero> listarId(int idEnfermero);
    List<Enfermero> search(String nameEnfermero);

    List<Enfermero> buscarEdad();

    List<ResultadoPatrick> buscarEnfxServicio();
}
