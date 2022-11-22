package pe.edu.upc.helpmefast.serviceimpls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.helpmefast.entities.Anuncio;
import pe.edu.upc.helpmefast.entities.ResultadoMiriam;
import pe.edu.upc.helpmefast.repositories.IAnuncioDAO;
import pe.edu.upc.helpmefast.serviceinterfaces.IAnuncioService;

import java.util.ArrayList;
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
    public List<Anuncio> search(String nameServicios) {
        return aR.buscarServicio(nameServicios);
    }

    @Override
    public List<Anuncio> buscarmes() {
        return aR.buscarmes();
    }

    @Override
    public List<ResultadoMiriam> buscarserviciosprecio() {
        List<ResultadoMiriam>lista=new ArrayList<>();
        aR.buscarserviciosprecio().forEach(y->{
            ResultadoMiriam rem= new ResultadoMiriam();
            rem.setServicio(y[0]);
            rem.setCantidad_de_anuncio(y[1]);
            rem.setPrecio_minimo(y[2]);
            rem.setPrecio_maximo(y[3]);
            lista.add(rem);
        });
        return lista;
    }
}

