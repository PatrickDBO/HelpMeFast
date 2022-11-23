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

    @ManyToOne
    @JoinColumn(name = "idAnuncio", nullable = false)
    private Anuncio anuncio;

    @ManyToOne
    @JoinColumn(name = "idAdultoJoven", nullable = false)
    private AdultoJoven adultoJoven;

    public Interes() {
    }

    public Interes(int idInteres, String levelInteres, Anuncio anuncio, AdultoJoven adultoJoven) {
        this.idInteres = idInteres;
        this.levelInteres = levelInteres;
        this.anuncio = anuncio;
        this.adultoJoven = adultoJoven;
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

    public Anuncio getAnuncio() {
        return anuncio;
    }

    public void setAnuncio(Anuncio anuncio) {
        this.anuncio = anuncio;
    }

    public AdultoJoven getAdultoJoven() {
        return adultoJoven;
    }

    public void setAdultoJoven(AdultoJoven adultoJoven) {
        this.adultoJoven = adultoJoven;
    }
}
