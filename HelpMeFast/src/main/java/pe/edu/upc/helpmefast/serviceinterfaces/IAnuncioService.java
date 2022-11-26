package pe.edu.upc.helpmefast.serviceinterfaces;

import pe.edu.upc.helpmefast.entities.Anuncio;
import pe.edu.upc.helpmefast.entities.ResultadoMiriam;

import java.util.List;
import java.util.Optional;

public interface IAnuncioService {
    public void insert(Anuncio anuncio);
    List<Anuncio> list();
    public void delete(int idAnuncio);
    public Optional<Anuncio> listarId(int idAnuncio);
    List<Anuncio> search(String servicio);

    List<Anuncio>buscarmes();

    List<ResultadoMiriam>buscarserviciosprecio();
}
