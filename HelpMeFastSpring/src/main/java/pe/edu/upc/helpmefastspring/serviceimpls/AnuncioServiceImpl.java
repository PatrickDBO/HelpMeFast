package pe.edu.upc.helpmefastspring.serviceimpls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.helpmefastspring.entities.Anuncio;
import pe.edu.upc.helpmefastspring.repositories.IAnuncioRepository;
import pe.edu.upc.helpmefastspring.serviceinterfaces.IAnuncioService;

import java.util.List;
@Service
public class AnuncioServiceImpl implements IAnuncioService {

    @Autowired
    private IAnuncioRepository aR;

    @Override
    public void insert(Anuncio anuncio) {
        aR.save(anuncio);
    }

    @Override
    public List<Anuncio> list() {
        return aR.findAll();
    }

    @Override
    public void delete(int idAnuncio) {
        aR.deleteById(idAnuncio);
    }

    @Override
    public List<Anuncio> search(String servicio) {
        return aR.buscarServicio(servicio);
    }
}
