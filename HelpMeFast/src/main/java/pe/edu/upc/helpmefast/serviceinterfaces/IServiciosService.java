package pe.edu.upc.helpmefast.serviceinterfaces;

import pe.edu.upc.helpmefast.entities.Interes;
import pe.edu.upc.helpmefast.entities.Servicios;

import java.util.List;
import java.util.Optional;

public interface IServiciosService {
    void insert(Servicios servicios);
    List<Servicios> list();
    void delete(int idServicios);
    Optional<Servicios> listarId(int idServicios);
    List<Servicios> search(String descServicios);
}
