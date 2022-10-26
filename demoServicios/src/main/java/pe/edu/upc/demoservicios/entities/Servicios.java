package pe.edu.upc.demoservicios.entities;

import javax.persistence.*;

@Entity
@Table (name="Servicios")
public class Servicios {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idServicios;
@Column(name="nameServicios", length = 60, nullable = false)
private String nameServicios;

    @Column(name="descServicios", length = 200, nullable = false)
    private String descServicios;

    public Servicios(){

    }
    public Servicios(int idServicios, String nameServicios, String descServicios) {
        this.idServicios = idServicios;
        this.nameServicios = nameServicios;
        this.descServicios = descServicios;
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
}
