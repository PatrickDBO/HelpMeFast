package pe.edu.upc.helpmefast.serviceinterfaces;

import pe.edu.upc.helpmefast.entities.Comentarios;

import java.util.List;
import java.util.Optional;

public interface IComentariosService {

    void insert(Comentarios comentarios);

    List<Comentarios> list();

    void delete(int idComentarios);

    Optional<Comentarios> listarId(int idComentarios);

    List<Comentarios> search(String numCalificacion);
}

