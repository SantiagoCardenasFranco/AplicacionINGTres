package com.uco.aplicacionWeb.AplicacionINGTres.aplicacion.dto;

import com.uco.aplicacionWeb.AplicacionINGTres.dominio.modelo.Usuario;

public class DtoUsuario {


    private int identificacin;
    private String nombre;
    private String apellido;
    private String correo;
    private String password;

    public DtoUsuario(){}

    public DtoUsuario(int identificacin, String nombre, String apellido, String correo, String password) {
        this.identificacin = identificacin;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.password = password;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getIdentificacin() {
        return identificacin;
    }

    public String getCorreo() {
        return correo;
    }

    public String getPassword() {
        return password;
    }
}
