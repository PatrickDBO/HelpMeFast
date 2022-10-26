package pe.edu.upc.demoservicios.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.demoservicios.entities.Servicios;

import java.util.List;

@Repository
public interface IServiceRepository extends JpaRepository<Servicios,Integer> {
    @Query("from Servicios s where s.descServicios like %:descServicios%")
    List<Servicios> buscarDescServicios(@Param("descServicios") String descServicios);
}
