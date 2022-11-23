package pe.edu.upc.helpmefast.serviceimpls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.helpmefast.entities.Anuncio;
import pe.edu.upc.helpmefast.repositories.IAnuncioDAO;
import pe.edu.upc.helpmefast.serviceinterfaces.IAnuncioService;

import java.util.List;
import java.util.Optional;

@Service
public class AnuncioServiceImpl implements IAnuncioService {

    @Autowired
    private IAnuncioDAO aR;

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
    public Optional<Anuncio> listarId(int idAnuncio) {
        return aR.findById(idAnuncio);
    }

    @Override
    public List<Anuncio> search(String servicio) {
        return aR.buscarServicio(servicio);
    }
}

