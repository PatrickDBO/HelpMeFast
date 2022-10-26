package pe.edu.upc.helpmefastspring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.helpmefastspring.entities.Anuncio;

import java.util.List;
@Repository
public interface IAnuncioRepository extends JpaRepository<Anuncio,Integer> {
    @Query("from Anuncio a where a.servicio like %:servicio%")
    List<Anuncio> buscarServicio(@Param("servicio") String servicio);
}
