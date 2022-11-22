package pe.edu.upc.helpmefast.serviceinterfaces;

import pe.edu.upc.helpmefast.entities.Anuncio;
import pe.edu.upc.helpmefast.entities.ResultadoMiriam;

import java.util.List;
import java.util.Optional;

public interface IAnuncioService {
    void insert(Anuncio anuncio);
    List<Anuncio> list();
    void delete(int idAnuncio);
    Optional<Anuncio> listarId(int idAnuncio);
    List<Anuncio> search(String nameServicios);

    List<Anuncio>buscarmes();
    List<ResultadoMiriam>buscarserviciosprecio();
}
