package pe.edu.upc.helpmefast.entities;

public class ResultadoAngello {
    private String nivel;
    private String cantidad;
    private String paciente;

    public ResultadoAngello() {
    }

    public ResultadoAngello(String nivel, String cantidad, String paciente) {
        this.nivel = nivel;
        this.cantidad = cantidad;
        this.paciente = paciente;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public String getPaciente() {
        return paciente;
    }

    public void setPaciente(String paciente) {
        this.paciente = paciente;
    }
}
