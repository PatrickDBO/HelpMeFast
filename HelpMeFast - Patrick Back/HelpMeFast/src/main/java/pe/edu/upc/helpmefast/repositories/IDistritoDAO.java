package pe.edu.upc.helpmefast.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.helpmefast.entities.Distrito;


import java.util.List;

@Repository
public interface IDistritoDAO extends JpaRepository<Distrito,Integer> {

    @Query("from Distrito d where d.nameDistrito like %:nameDistrito%")
    List<Distrito> buscarDistrito(@Param("nameDistrito") String nameDistrito);
}
