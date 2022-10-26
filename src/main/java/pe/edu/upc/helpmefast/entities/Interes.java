package pe.edu.upc.helpmefast.entities;

import javax.persistence.*;

@Entity
@Table(name = "Interes")
public class Interes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idInteres;
    @Column(name = "levelInteres",length = 40,nullable = false)
    private String levelInteres;

    public Interes() {
    }

    public Interes(int idInteres, String levelInteres) {
        this.idInteres = idInteres;
        this.levelInteres = levelInteres;
    }

    public int getIdInteres() {
        return idInteres;
    }

    public void setIdInteres(int idInteres) {
        this.idInteres = idInteres;
    }

    public String getLevelInteres() {
        return levelInteres;
    }

    public void setLevelInteres(String levelInteres) {
        this.levelInteres = levelInteres;
    }
}
