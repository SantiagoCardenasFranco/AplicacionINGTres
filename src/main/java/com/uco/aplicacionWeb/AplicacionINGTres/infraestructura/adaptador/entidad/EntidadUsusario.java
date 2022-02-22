package com.uco.aplicacionWeb.AplicacionINGTres.infraestructura.adaptador.entidad;

import javax.persistence.*;

@Entity
@Table(name= "usuario")
public class EntidadUsusario {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long identificacion;

    private String nombre;
    private String apellido;
    private String correo;
    private String password;

    public EntidadUsusario() {
    }

    public EntidadUsusario(String nombre, String apellido, String correo, String password) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.password = password;
    }

    public Long getIdentificacion() {
        return identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public String getPassword() {
        return password;
    }
}
