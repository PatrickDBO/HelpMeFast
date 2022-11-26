package pe.edu.upc.helpmefast.serviceimpls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pe.edu.upc.helpmefast.entities.Interes;
import pe.edu.upc.helpmefast.entities.ResultadoAngello;
import pe.edu.upc.helpmefast.entities.Resultadonivelalto;
import pe.edu.upc.helpmefast.repositories.IInteresDAO;
import pe.edu.upc.helpmefast.serviceinterfaces.IInteresService;

import java.util.ArrayList;
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

    @Override
    public List<Interes> buscarNivel() { return iR.buscarnivel(); }

    @Override
    public List<Resultadonivelalto> interesAltoPaciente() {

        List<Resultadonivelalto> lista=new ArrayList<>();
        iR.interesAltoPaciente().forEach(y->{
            Resultadonivelalto rna=  new Resultadonivelalto();
            rna.setPaciente(y[0]);
            rna.setNivelinteres(y[1]);
            rna.setNombreservicio(y[2]);
            rna.setFechapublicacion(y[3]);
            rna.setEnfermero(y[4]);
            lista.add(rna);
        });

        return lista;
    }

    @Override
    public List<ResultadoAngello> buscarCantidadAnuncios() {
        List<ResultadoAngello> lista=new ArrayList<>();
        iR.buscarCantidadAnuncios().forEach(y->{
            ResultadoAngello rea=  new ResultadoAngello();
            rea.setNivel(y[0]);
            rea.setCantidad(y[1]);
            rea.setPaciente(y[2]);
            lista.add(rea);
        });
        return lista;
    }
}
