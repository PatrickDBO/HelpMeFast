package pe.edu.upc.helpmefast.serviceinterfaces;

import pe.edu.upc.helpmefast.entities.Interes;
import pe.edu.upc.helpmefast.entities.Servicios;

import java.util.List;
import java.util.Optional;

public interface IInteresService {
    boolean insert(Interes interes);
    List<Interes> list();
    void delete(int idInteres);
    Optional<Interes> listarId(int idInteres);
    List<Interes> search(String levelInteres);
}
