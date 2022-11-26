package pe.edu.upc.helpmefast.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.helpmefast.entities.Comentarios;

import java.util.List;
@Repository
public interface IComentariosDAO extends JpaRepository<Comentarios,Integer> {

    @Query("from Comentarios c where c.numCalificacion like %:numCalificacion%")
    List<Comentarios> buscarComentarios(@Param("numCalificacion") String numCalificacion);
}
