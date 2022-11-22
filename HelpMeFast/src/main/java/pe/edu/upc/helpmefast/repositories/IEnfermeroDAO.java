package pe.edu.upc.helpmefast.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.helpmefast.entities.Enfermero;

import java.util.List;

@Repository
public interface IEnfermeroDAO extends JpaRepository<Enfermero,Integer> {

    @Query("FROM Enfermero p WHERE p.nameEnfermero LIKE %:nameEnfermero% OR LOWER(p.nameEnfermero)" +
            "LIKE %:nameEnfermero% OR p.nameEnfermero LIKE %:nameEnfermero%")
    List<Enfermero> buscarNombre(@Param("nameEnfermero") String nameEnfermero);
}

