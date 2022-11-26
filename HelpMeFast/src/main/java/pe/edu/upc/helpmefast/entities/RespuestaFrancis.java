package pe.edu.upc.helpmefast.entities;

public class RespuestaFrancis {

    private String enfermero;
    private String cantidad;

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

    public RespuestaFrancis() {
    }

    public RespuestaFrancis(String enfermero, String cantidad) {
        this.enfermero = enfermero;
        this.cantidad = cantidad;
    }
}
