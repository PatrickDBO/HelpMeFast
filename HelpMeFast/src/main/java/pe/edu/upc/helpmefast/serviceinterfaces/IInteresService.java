package pe.edu.upc.helpmefast.serviceinterfaces;

import pe.edu.upc.helpmefast.entities.Interes;

import java.util.List;

public interface IInteresService {
    public void insert(Interes interes);
    List<Interes> list();
    public void delete(int idInteres);
    List<Interes> search(String levelInteres);
}
