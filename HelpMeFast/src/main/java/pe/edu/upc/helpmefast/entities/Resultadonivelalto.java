package pe.edu.upc.helpmefast.entities;

public class Resultadonivelalto {

    private String paciente;
    private String nivelinteres;
    private String nombreservicio;
    private String fechapublicacion;
    private String enfermero;
    private String cantidad;


    public Resultadonivelalto() {
    }


    public Resultadonivelalto(String paciente, String nivelinteres, String nombreservicio, String fechapublicacion, String enfermero, String cantidad) {
        this.paciente = paciente;
        this.nivelinteres = nivelinteres;
        this.nombreservicio = nombreservicio;
        this.fechapublicacion = fechapublicacion;
        this.enfermero = enfermero;
        this.cantidad = cantidad;
    }

    public String getPaciente() {
        return paciente;
    }

    public void setPaciente(String paciente) {
        this.paciente = paciente;
    }

    public String getNivelinteres() {
        return nivelinteres;
    }

    public void setNivelinteres(String nivelinteres) {
        this.nivelinteres = nivelinteres;
    }

    public String getNombreservicio() {
        return nombreservicio;
    }

    public void setNombreservicio(String nombreservicio) {
        this.nombreservicio = nombreservicio;
    }

    public String getFechapublicacion() {
        return fechapublicacion;
    }

    public void setFechapublicacion(String fechapublicacion) {
        this.fechapublicacion = fechapublicacion;
    }

    public String getEnfermero() {
        return enfermero;
    }

    public void setEnfermero(String enfermero) {
        this.enfermero = enfermero;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }
}
