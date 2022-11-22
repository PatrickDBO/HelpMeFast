package pe.edu.upc.helpmefast.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.helpmefast.entities.Interes;

import java.util.List;

@Repository
public interface IInteresDAO extends JpaRepository<Interes,Integer> {
    @Query("from Interes i where i.levelInteres like %:levelInteres% OR LOWER(i.levelInteres)" +
            "like %:levelInteres% OR i.levelInteres like %:levelInteres%")
    List<Interes> buscarNivel(@Param("levelInteres") String levelInteres);
}
