package pe.edu.upc.helpmefastspring.serviceinterfaces;

import pe.edu.upc.helpmefastspring.entities.Anuncio;

import java.util.List;

public interface IAnuncioService {
    public void insert(Anuncio anuncio);
    List<Anuncio> list();
    public void delete(int idAnuncio);
    List<Anuncio> search(String servicio);
}
