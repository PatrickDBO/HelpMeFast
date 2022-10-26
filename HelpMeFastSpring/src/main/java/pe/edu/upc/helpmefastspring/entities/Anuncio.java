package pe.edu.upc.helpmefastspring.entities;

import javax.persistence.*;

@Entity
@Table(name="Anuncio")
public class Anuncio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idAnuncio;
    @Column(name = "precioServicio",length = 3,nullable = false)
    private int precioServicio;
    @Column(name = "fechaPublicación",length = 10,nullable = false)
    private String fechaPublicación;
    @Column(name = "servicio",length = 40,nullable = false)
    private String servicio;

    public Anuncio() {
    }

    public Anuncio(int idAnuncio, int precioServicio, String fechaPublicación, String servicio) {
        this.idAnuncio = idAnuncio;
        this.precioServicio = precioServicio;
        this.fechaPublicación = fechaPublicación;
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

    public String getFechaPublicación() {
        return fechaPublicación;
    }

    public void setFechaPublicación(String fechaPublicación) {
        this.fechaPublicación = fechaPublicación;
    }

    public String getServicio() {
        return servicio;
    }

    public void setServicio(String servicio) {
        this.servicio = servicio;
    }
}
