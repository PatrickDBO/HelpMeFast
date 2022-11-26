package pe.edu.upc.helpmefast.serviceinterfaces;

import pe.edu.upc.helpmefast.entities.Interes;
import pe.edu.upc.helpmefast.entities.ResultadoAngello;
import pe.edu.upc.helpmefast.entities.Resultadonivelalto;
import pe.edu.upc.helpmefast.entities.Servicios;

import java.util.List;
import java.util.Optional;

public interface IInteresService {
    public boolean insert(Interes interes);
    List<Interes> list();
    public void delete(int idInteres);
    public Optional<Interes> listarId(int idInteres);
    List<Interes> search(String levelInteres);

    List<Resultadonivelalto> interesAltoPaciente();

    List<Interes> buscarNivel();

    List<ResultadoAngello> buscarCantidadAnuncios();
}
