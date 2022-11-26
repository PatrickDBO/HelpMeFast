package pe.edu.upc.helpmefast.entities;

import javax.persistence.*;

@Entity
@Table(name = "AdultoJoven")
public class AdultoJoven {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idAdultoJoven;
    @Column(name = "nombre", length = 20, nullable = false)
    private String nombre;
    @Column(name = "apellido", length = 20, nullable = false)
    private String apellido;
    private int edad;
    private int dni;
    private int celular;
    @Column(name = "email", length = 40, nullable = false)
    private String email;
    @Column(name = "direccion", length = 50, nullable = false)
    private String direccion;
    @Column(name = "username", length = 20, nullable = false)
    private String username;
    @Column(name = "password", length = 20, nullable = false)
    private String password;

    public AdultoJoven() {
    }

    public AdultoJoven(int idAdultoJoven, String nombre, String apellido, int edad, int dni, int celular, String email, String direccion, String username, String password) {
        this.idAdultoJoven = idAdultoJoven;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.dni = dni;
        this.celular = celular;
        this.email = email;
        this.direccion = direccion;
        this.username = username;
        this.password = password;
    }

    public int getIdAdultoJoven() {
        return idAdultoJoven;
    }

    public void setIdAdultoJoven(int idAdultoJoven) {
        this.idAdultoJoven = idAdultoJoven;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

