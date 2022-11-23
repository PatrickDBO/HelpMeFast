package pe.edu.upc.helpmefast.serviceimpls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pe.edu.upc.helpmefast.entities.Interes;
import pe.edu.upc.helpmefast.repositories.IInteresDAO;
import pe.edu.upc.helpmefast.serviceinterfaces.IInteresService;

import java.util.List;
import java.util.Optional;

@Service
public class InteresServiceImpl implements IInteresService {
    @Autowired
    private IInteresDAO iR;

    @Override
    @Transactional
    public boolean insert(Interes interes) {
        Interes objInteres = iR.save(interes);
        if(objInteres==null){
            return false;
        }else{
            return true;
        }
    }

    @Override
    public List<Interes> list() {
        return iR.findAll();
    }

    @Override
    @Transactional
    public void delete(int idInteres) {
        iR.deleteById(idInteres);
    }

    @Override
    public Optional<Interes> listarId(int idInteres) {
        return iR.findById(idInteres);
    }

    @Override
    public List<Interes> search(String levelInteres) { return iR.buscarNivel(levelInteres); }
}
