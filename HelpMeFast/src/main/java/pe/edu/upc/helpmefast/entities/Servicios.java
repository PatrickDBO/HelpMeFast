package pe.edu.upc.helpmefast.entities;

import javax.persistence.*;

@Entity
@Table(name="Servicios")
public class Servicios {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idServicios;
    @Column(name="nameServicios", length = 60, nullable = false)
    private String nameServicios;

    @Column(name="descServicios", length = 200, nullable = false)
    private String descServicios;

    @ManyToOne
    @JoinColumn(name="idDistrito", nullable=false)
    private Distrito distrito;

    @ManyToOne
    @JoinColumn(name="idEnfermero", nullable=false)
    private Enfermero enfermero;

    public Servicios(){

    }

    public Servicios(int idServicios, String nameServicios, String descServicios, Distrito distrito, Enfermero enfermero) {
        this.idServicios = idServicios;
        this.nameServicios = nameServicios;
        this.descServicios = descServicios;
        this.distrito = distrito;
        this.enfermero = enfermero;
    }

    public int getIdServicios() {
        return idServicios;
    }

    public void setIdServicios(int idServicios) {
        this.idServicios = idServicios;
    }

    public String getNameServicios() {
        return nameServicios;
    }

    public void setNameServicios(String nameServicios) {
        this.nameServicios = nameServicios;
    }

    public String getDescServicios() {
        return descServicios;
    }

    public void setDescServicios(String descServicios) {
        this.descServicios = descServicios;
    }

    public Distrito getDistrito() {
        return distrito;
    }

    public void setDistrito(Distrito distrito) {
        this.distrito = distrito;
    }

    public Enfermero getEnfermero() {
        return enfermero;
    }

    public void setEnfermero(Enfermero enfermero) {
        this.enfermero = enfermero;
    }
}
