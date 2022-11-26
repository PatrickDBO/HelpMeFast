package pe.edu.upc.helpmefast.entities;

import javax.persistence.*;

@Entity
@Table(name = "Distrito")
public class Distrito {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idDistrito;

    @Column(name = "nameDistrito", length = 40, nullable = false)
    private String nameDistrito;


    public Distrito() {}

    public Distrito(int idDistrito, String nameDistrito) {
        this.idDistrito = idDistrito;
        this.nameDistrito = nameDistrito;
    }

    public int getIdDistrito() {
        return idDistrito;
    }

    public void setIdDistrito(int idDistrito) {
        this.idDistrito = idDistrito;
    }

    public String getNameDistrito() {
        return nameDistrito;
    }

    public void setNameDistrito(String nameDistrito) {
        this.nameDistrito = nameDistrito;
    }
}
