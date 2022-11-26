package pe.edu.upc.helpmefast.serviceimpls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.helpmefast.entities.Comentarios;
import pe.edu.upc.helpmefast.repositories.IComentariosDAO;
import pe.edu.upc.helpmefast.serviceinterfaces.IComentariosService;


import java.util.List;
import java.util.Optional;

@Service
public class ComentariosServiceImpl implements IComentariosService {
    @Autowired
    private IComentariosDAO cD;

    @Override
    public void insert(Comentarios comentarios) {cD.save(comentarios);
    }

    @Override
    public List<Comentarios> list() {
        return cD.findAll();
    }

    @Override
    public void delete(int idComentarios) {
        cD.deleteById(idComentarios);}

    @Override
    public Optional<Comentarios> listarId(int idComentarios) {
        return cD.findById(idComentarios);
    }

    @Override
    public List<Comentarios> search(String numCalificacion) {
        return cD.buscarComentarios(numCalificacion);
    }
}
