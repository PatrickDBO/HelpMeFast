package pe.edu.upc.helpmefast.serviceinterfaces;

import pe.edu.upc.helpmefast.entities.Distrito;

import java.util.List;
import java.util.Optional;

public interface IDistritoService {

    void insert(Distrito distrito);

    List<Distrito> list();

    void delete(int idDistrito);

    Optional<Distrito> listarId(int idDistrito);

    List<Distrito> search(String nameDistrito);
}
