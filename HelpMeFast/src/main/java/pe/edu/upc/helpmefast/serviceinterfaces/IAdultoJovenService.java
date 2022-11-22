package pe.edu.upc.helpmefast.serviceinterfaces;

import pe.edu.upc.helpmefast.entities.AdultoJoven;

import java.util.List;
import java.util.Optional;

public interface IAdultoJovenService {
    void insert(AdultoJoven adultoJoven);
    List<AdultoJoven> list();
    void delete(int id);
    Optional<AdultoJoven> listarId(int idAdultoJoven);
    List<AdultoJoven> search(String nombre);
}
