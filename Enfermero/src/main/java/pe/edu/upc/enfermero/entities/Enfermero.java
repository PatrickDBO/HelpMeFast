package pe.edu.upc.enfermero.entities;

import javax.persistence.*;

@Entity
@Table(name = "Enfermero")
public class Enfermero {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int idEnfermero;

    @Column(name = "nameEnfermero", length = 40, nullable = false)
    private String nameEnfermero;

    @Column(name = "dniEnfermero", length = 8, nullable = false)
    private String dniEnfermero;

    @Column(name = "edadEnfermero", length = 2, nullable = false)
    private int edadEnfermero;

    @Column(name = "numEnfermero", length = 9, nullable = false)
    private int numEnfermero;

    @Column(name = "emailEnfermero", length = 35, nullable = false)
    private String emailEnfermero;

    @Column(name = "codEnfermero", length = 8, nullable = false)
    private String codEnfermero;

    public Enfermero() {}
    public Enfermero(int idEnfermero, String nameEnfermero, String dniEnfermero, int edadEnfermero, int numEnfermero, String emailEnfermero, String codEnfermero) {
        this.idEnfermero = idEnfermero;
        this.nameEnfermero = nameEnfermero;
        this.dniEnfermero = dniEnfermero;
        this.edadEnfermero = edadEnfermero;
        this.numEnfermero = numEnfermero;
        this.emailEnfermero = emailEnfermero;
        this.codEnfermero = codEnfermero;
    }

    public int getIdEnfermero() {
        return idEnfermero;
    }

    public void setIdEnfermero(int idEnfermero) {
        this.idEnfermero = idEnfermero;
    }

    public String getNameEnfermero() {
        return nameEnfermero;
    }

    public void setNameEnfermero(String nameEnfermero) {
        this.nameEnfermero = nameEnfermero;
    }

    public String getDniEnfermero() {
        return dniEnfermero;
    }

    public void setDniEnfermero(String dniEnfermero) {
        this.dniEnfermero = dniEnfermero;
    }

    public int getEdadEnfermero() {
        return edadEnfermero;
    }

    public void setEdadEnfermero(int edadEnfermero) {
        this.edadEnfermero = edadEnfermero;
    }

    public int getNumEnfermero() {
        return numEnfermero;
    }

    public void setNumEnfermero(int numEnfermero) {
        this.numEnfermero = numEnfermero;
    }

    public String getEmailEnfermero() {
        return emailEnfermero;
    }

    public void setEmailEnfermero(String emailEnfermero) {
        this.emailEnfermero = emailEnfermero;
    }

    public String getCodEnfermero() {
        return codEnfermero;
    }

    public void setCodEnfermero(String codEnfermero) {
        this.codEnfermero = codEnfermero;
    }
}