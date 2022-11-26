package pe.edu.upc.helpmefast.entities;

public class ResultadoMiriam {

    private String servicio;
    private String cantidad_de_anuncio;
    private String precio_minimo;
    private String precio_maximo;

    public ResultadoMiriam() {
    }

    public ResultadoMiriam(String servicio, String cantidad_de_anuncio, String precio_minimo, String precio_maximo) {
        this.servicio = servicio;
        this.cantidad_de_anuncio = cantidad_de_anuncio;
        this.precio_minimo = precio_minimo;
        this.precio_maximo = precio_maximo;
    }

    public String getServicio() {
        return servicio;
    }

    public void setServicio(String servicio) {
        this.servicio = servicio;
    }

    public String getCantidad_de_anuncio() {
        return cantidad_de_anuncio;
    }

    public void setCantidad_de_anuncio(String cantidad_de_anuncio) {
        this.cantidad_de_anuncio = cantidad_de_anuncio;
    }

    public String getPrecio_minimo() {
        return precio_minimo;
    }

    public void setPrecio_minimo(String precio_minimo) {
        this.precio_minimo = precio_minimo;
    }

    public String getPrecio_maximo() {
        return precio_maximo;
    }

    public void setPrecio_maximo(String precio_maximo) {
        this.precio_maximo = precio_maximo;
    }
}
