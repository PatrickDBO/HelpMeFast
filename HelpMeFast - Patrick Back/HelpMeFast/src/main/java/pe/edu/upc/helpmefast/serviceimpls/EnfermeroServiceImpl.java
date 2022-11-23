package pe.edu.upc.helpmefast.serviceimpls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.helpmefast.entities.Enfermero;
import pe.edu.upc.helpmefast.entities.ResultadoPatrick;
import pe.edu.upc.helpmefast.repositories.IEnfermeroDAO;
import pe.edu.upc.helpmefast.serviceinterfaces.IEnfermeroService;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class EnfermeroServiceImpl implements IEnfermeroService {

    @Autowired
    private IEnfermeroDAO eR;

    @Override
    public void insert(Enfermero enfermero) {
        eR.save(enfermero);
    }

    @Override
    public List<Enfermero> list() { return eR.findAll(); }

    @Override
    public void delete(int idEnfermero) { eR.deleteById(idEnfermero); }

    @Override
    public Optional<Enfermero> listarId(int idEnfermero) {return eR.findById(idEnfermero);}

    @Override
    public List<Enfermero> search(String nameEnfermero) {
        return eR.buscarNombre(nameEnfermero); }

    @Override
    public List<Enfermero> buscarEdad() {
        return eR.buscarEdad();
    }

    @Override
    public List<ResultadoPatrick> buscarEnfxServicio()
    {
        List<ResultadoPatrick> lista = new ArrayList<>();
        eR.buscarEnfxServicio().forEach(y->{
            ResultadoPatrick rp = new ResultadoPatrick();
            rp.setCodigo(y[0]);
            rp.setNombre(y[1]);
            rp.setEdad(y[2]);
            rp.setNumero(y[3]);
            rp.setEspecialidad(y[4]);
            lista.add(rp);
        });
        return lista;
    }
}

