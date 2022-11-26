package pe.edu.upc.helpmefast.entities;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name="Anuncio")
public class Anuncio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idAnuncio;
    @Column(name = "precioServicio",length = 3,nullable = false)
    private int precioServicio;

    @Column(name = "fechaPublicacion")
    @JsonSerialize(using = ToStringSerializer.class)
    private LocalDate fechaPublicacion;
    @ManyToOne
    @JoinColumn(name="idServicios", nullable=false)
    private Servicios servicio;

    public Anuncio() {
        // TODO Auto-generated constructor stub
    }

    public Anuncio(int idAnuncio, int precioServicio, LocalDate fechaPublicacion, Servicios servicio) {
        this.idAnuncio = idAnuncio;
        this.precioServicio = precioServicio;
        this.fechaPublicacion = fechaPublicacion;
        this.servicio = servicio;
    }

    public int getIdAnuncio() {
        return idAnuncio;
    }

    public void setIdAnuncio(int idAnuncio) {
        this.idAnuncio = idAnuncio;
    }

    public int getPrecioServicio() {
        return precioServicio;
    }

    public void setPrecioServicio(int precioServicio) {
        this.precioServicio = precioServicio;
    }

    public LocalDate getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(LocalDate fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public Servicios getServicio() {
        return servicio;
    }

    public void setServicio(Servicios servicio) {
        this.servicio = servicio;
    }
}
