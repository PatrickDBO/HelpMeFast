package pe.edu.upc.enfermero.enfermeroimpls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.enfermero.entities.Enfermero;
import pe.edu.upc.enfermero.repositories.IEnfermeroRepository;
import pe.edu.upc.enfermero.enfermerointerfaces.IEnfermeroService;

import java.util.List;
@Service
public class EnfermeroServiceImpl implements IEnfermeroService {

    @Autowired
    private IEnfermeroRepository eR;

    @Override
    public void insert(Enfermero enfermero) {
        eR.save(enfermero);
    }

    @Override
    public List<Enfermero> list() { return eR.findAll(); }

    @Override
    public void delete(int idEnfermero) { eR.deleteById(idEnfermero); }

    @Override
    public List<Enfermero> search(String nameEnfermero) {
        return eR.buscarNombre(nameEnfermero); }
}

