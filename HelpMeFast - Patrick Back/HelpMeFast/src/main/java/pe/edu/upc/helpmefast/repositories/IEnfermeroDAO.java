package pe.edu.upc.helpmefast.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.helpmefast.entities.Enfermero;

import java.util.List;

@Repository
public interface IEnfermeroDAO extends JpaRepository<Enfermero,Integer> {

    @Query(" FROM Enfermero p WHERE p.nameEnfermero LIKE %:nameEnfermero% OR LOWER(p.nameEnfermero)" +
            "LIKE %:nameEnfermero% OR p.nameEnfermero LIKE %:nameEnfermero% ")
    List<Enfermero> buscarNombre(@Param("nameEnfermero") String nameEnfermero);

    @Query (value = "SELECT * FROM enfermero WHERE edad_enfermero >=30", nativeQuery = true)
    List<Enfermero> buscarEdad();

    @Query (value = " SELECT e.cod_enfermero AS CODIGO, e.name_enfermero AS NOMBRE, e.edad_enfermero AS EDAD, e.num_enfermero AS NUMERO, s.name_servicios AS ESPECIALIDAD FROM enfermero e LEFT JOIN servicios s ON s.id_enfermero = e.id_enfermero WHERE s.id_servicios IS NOT NULL ", nativeQuery = true)
    List<String[]> buscarEnfxServicio();


}

