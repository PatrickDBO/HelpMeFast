package pe.edu.upc.helpmefast.serviceimpls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.helpmefast.entities.Interes;
import pe.edu.upc.helpmefast.entities.Servicios;
import pe.edu.upc.helpmefast.repositories.IServiciosDAO;
import pe.edu.upc.helpmefast.serviceinterfaces.IServiciosService;

import java.util.List;
import java.util.Optional;

@Service
public class ServiciosServiceImpl implements IServiciosService {

    @Autowired
    private IServiciosDAO sS;

    @Override
    public void insert(Servicios servicios) {sS.save(servicios);
    }

    @Override
    public List<Servicios> list() {
        return sS.findAll();
    }

    @Override
    public void delete(int idServicios) {
        sS.deleteById(idServicios);}

    @Override
    public Optional<Servicios> listarId(int idServicios) {
        return sS.findById(idServicios);
    }

    @Override
    public List<Servicios> search(String descServicios) {
        return sS.buscarDescServicios(descServicios);
    }
}
