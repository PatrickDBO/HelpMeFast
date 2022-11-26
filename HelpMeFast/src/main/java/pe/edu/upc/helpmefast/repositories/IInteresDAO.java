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

    @Query(value ="select * from Interes i where i.level_interes like 'alto' order by i.id_adulto_joven asc" ,nativeQuery = true)
    List<Interes> buscarnivel();

    @Query(value ="Select aj.nombre as \"Nombre del paciente\", i.level_interes as \"Nivel de Interes\", s.name_servicios as \"Nombre del Servicio\", a.fecha_publicacion as \"Fecha de publicacion del servicio\", e.name_enfermero as \"Nombre del Enfermero\" from interes i, adulto_joven aj, anuncio a, servicios s, enfermero e where i.id_adulto_joven=aj.id_adulto_joven AND i.id_anuncio=a.id_anuncio AND a.id_servicios=s.id_servicios AND s.id_enfermero=e.id_enfermero AND i.level_interes like '%alto' group by aj.nombre, i.level_interes, s.name_servicios, a.fecha_publicacion,e.name_enfermero" ,nativeQuery = true)
    List<String[]> interesAltoPaciente();

    @Query(value ="select i.level_interes as Nivel_Interes, count(i.id_anuncio) as Cant_Anuncios, aj.nombre as Nombre_Paciente from Interes i inner join adulto_joven aj on i.id_interes=aj.id_adulto_joven group by i.level_interes, aj.nombre" ,nativeQuery = true)
    List<String[]> buscarCantidadAnuncios();
}
