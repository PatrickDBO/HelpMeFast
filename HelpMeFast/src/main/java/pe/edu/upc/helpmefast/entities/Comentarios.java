package pe.edu.upc.helpmefast.entities;

import org.springframework.stereotype.Service;

import javax.persistence.*;

@Entity
@Table(name = "Comentarios")
public class Comentarios {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idComentarios;

    @Column(name = "opinion", length = 40, nullable = false)
    private String opinion;

    @Column(name = "numCalificacion", length = 40, nullable = false)
    private String numCalificacion;

    @ManyToOne
    @JoinColumn(name="idServicios", nullable=false)
    private Servicios servicio;

    public Comentarios(){}

    public Comentarios(int idComentarios, String opinion, String numCalificacion, Servicios servicio) {
        this.idComentarios = idComentarios;
        this.opinion = opinion;
        this.numCalificacion = numCalificacion;
        this.servicio = servicio;
    }

    public int getIdComentarios() {
        return idComentarios;
    }

    public void setIdComentarios(int idComentarios) {
        this.idComentarios = idComentarios;
    }

    public String getOpinion() {
        return opinion;
    }

    public void setOpinion(String opinion) {
        this.opinion = opinion;
    }

    public String getNumCalificacion() {
        return numCalificacion;
    }

    public void setNumCalificacion(String numCalificacion) {
        this.numCalificacion = numCalificacion;
    }

    public Servicios getServicio() {
        return servicio;
    }

    public void setServicio(Servicios servicio) {
        this.servicio = servicio;
    }
}
