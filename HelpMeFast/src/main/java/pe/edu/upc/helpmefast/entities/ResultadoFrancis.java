package pe.edu.upc.helpmefast.entities;

public class ResultadoFrancis {

    private String anuncio;
    private String cantidad;

    public ResultadoFrancis(String anuncio, String cantidad) {

        this.anuncio = anuncio;
        this.cantidad = cantidad;
    }

    public ResultadoFrancis() {
    }

    public String getAnuncio() {
        return anuncio;
    }

    public void setAnuncio(String anuncio) {
        this.anuncio = anuncio;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }
}
