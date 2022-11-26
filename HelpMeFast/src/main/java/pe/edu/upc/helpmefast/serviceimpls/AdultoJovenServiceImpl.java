package pe.edu.upc.helpmefast.serviceimpls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.helpmefast.entities.AdultoJoven;
import pe.edu.upc.helpmefast.repositories.IAdultoJovenDAO;
import pe.edu.upc.helpmefast.serviceinterfaces.IAdultoJovenService;

import java.util.List;
import java.util.Optional;

@Service
public class AdultoJovenServiceImpl implements IAdultoJovenService {
    @Autowired
    private IAdultoJovenDAO ajR;
    @Override
    public void insert(AdultoJoven adultoJoven) {
        ajR.save(adultoJoven);
    }

    @Override
    public List<AdultoJoven> list() {
        return ajR.findAll();
    }

    @Override
    public void delete(int id) {
        ajR.deleteById(id);
    }

    @Override
    public Optional<AdultoJoven> listarId(int idAdultoJoven) {
        return ajR.findById(idAdultoJoven);
    }

    @Override
    public List<AdultoJoven> search(String nombre) {
        return ajR.buscarAdultoJoven(nombre);
    }

    @Override
    public List<AdultoJoven> buscarpersonasdeterceraedad() {
        return ajR.buscarpersonasdeterceraedad();
    }
}
