package pe.edu.upc.demoservicios.serviceimpls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.demoservicios.entities.Servicios;
import pe.edu.upc.demoservicios.repositories.IServiceRepository;
import pe.edu.upc.demoservicios.serviceinterfaces.IServiciosService;

import java.util.Collections;
import java.util.List;

@Service
public class ServiciosServiceImpl implements IServiciosService {

    @Autowired
    private IServiceRepository sS;

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
    public List<Servicios> search(String descServicios) {
        return sS.buscarDescServicios(descServicios);
    }
}
