package pe.edu.upc.helpmefast.entities;

public class ResultadoPatrick {

    private String nombre;
    private String codigo;
    private String edad;
    private String numero;
    private String especialidad;

    public ResultadoPatrick() {}

    public ResultadoPatrick(String nombre, String codigo, String edad, String numero, String especialidad) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.edad = edad;
        this.numero = numero;
        this.especialidad = especialidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
}

