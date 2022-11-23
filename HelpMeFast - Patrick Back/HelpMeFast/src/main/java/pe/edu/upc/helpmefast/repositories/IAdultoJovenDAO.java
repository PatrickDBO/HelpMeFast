package pe.edu.upc.helpmefast.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.helpmefast.entities.AdultoJoven;

import java.util.List;

@Repository
public interface IAdultoJovenDAO extends JpaRepository<AdultoJoven, Integer> {
    @Query("from AdultoJoven aj where aj.nombre like %:nombre% OR LOWER(aj.nombre)" +
            "like %:nombre% OR aj.nombre like %:nombre%")
    List<AdultoJoven> buscarAdultoJoven(@Param("nombre") String nombre);
}
