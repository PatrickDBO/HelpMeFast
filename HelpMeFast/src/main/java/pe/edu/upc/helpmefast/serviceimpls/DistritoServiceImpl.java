package pe.edu.upc.helpmefast.serviceimpls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.helpmefast.entities.Distrito;
import pe.edu.upc.helpmefast.repositories.IDistritoDAO;
import pe.edu.upc.helpmefast.serviceinterfaces.IDistritoService;

import java.util.List;
import java.util.Optional;

@Service
public class DistritoServiceImpl implements IDistritoService {

    @Autowired
    private IDistritoDAO sD;

    @Override
    public void insert(Distrito distrito) {sD.save(distrito);
    }

    @Override
    public List<Distrito> list() {
        return sD.findAll();
    }

    @Override
    public void delete(int idDistrito) {
        sD.deleteById(idDistrito);}

    @Override
    public Optional<Distrito> listarId(int idDistrito) {
        return sD.findById(idDistrito);
    }

    @Override
    public List<Distrito> search(String nameDistrito) {
        return sD.buscarDistrito(nameDistrito);
    }
}
