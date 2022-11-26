package pe.edu.upc.helpmefast.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.helpmefast.entities.Servicios;

import java.util.List;

@Repository
public interface IServiciosDAO extends JpaRepository<Servicios,Integer> {
    @Query("from Servicios s where s.descServicios like %:descServicios%")
    List<Servicios> buscarDescServicios(@Param("descServicios") String descServicios);


    @Query( value= "Select p.name_enfermero,count(s.id_servicios) from Servicios s inner join enfermero p on s.id_enfermero=p.id_enfermero group by p.name_enfermero",nativeQuery = true)
    List<String[]> buscarserviciosenfermero();

    @Query(value="Select d.name_distrito, count (s.id_servicios) as \"cantidad de anuncios\" from anuncio a inner join servicios s on a.id_servicios=s.id_servicios inner join distrito d on s.id_distrito=d.id_distrito group by d.name_distrito",nativeQuery = true)
    List<String[]> buscaranunciosdistrito();
}
