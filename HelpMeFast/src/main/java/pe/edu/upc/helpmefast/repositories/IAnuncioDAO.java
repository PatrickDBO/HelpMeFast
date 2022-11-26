package pe.edu.upc.helpmefast.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.helpmefast.entities.Anuncio;

import java.util.List;

@Repository
public interface IAnuncioDAO extends JpaRepository<Anuncio,Integer> {
    @Query("from Anuncio a where a.servicio.descServicios like %:servicio%")
    List<Anuncio> buscarServicio(@Param("servicio") String servicio);

    @Query(value = "select * from Anuncio a where TO_CHAR(a.fecha_publicacion,'MM')='11'",nativeQuery = true)
    List<Anuncio>buscarmes();

    @Query(value ="select s.name_servicios as servicio, count(a.id_anuncio)as \"cantidad_de_anuncios\", min(a.precio_servicio) as \"precio_minimo\",max(a.precio_servicio)\"precio_maximo\" from Anuncio a inner join Servicios s on a.id_servicios= s.id_servicios group by s.name_servicios" ,nativeQuery = true)
    List<String[]> buscarserviciosprecio();
}
