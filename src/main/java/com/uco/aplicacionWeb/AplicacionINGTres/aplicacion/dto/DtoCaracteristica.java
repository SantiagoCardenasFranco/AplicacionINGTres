package com.uco.aplicacionWeb.AplicacionINGTres.aplicacion.dto;

public class DtoCaracteristica {

    private int idCiudad;
    private String nombre;
    private String nombreDelProveedor;

    public DtoCaracteristica() {
    }

    private DtoCaracteristica(int idCiudad, String nombre, String nombreDelProveedor) {
        this.idCiudad = idCiudad;
        this.nombre = nombre;
        this.nombreDelProveedor = nombreDelProveedor;
    }

    public String getNombre() {
        return nombre;
    }

    public int getIdCiudad() {
        return idCiudad;
    }

    public String getNombreDelProveedor() {
        return nombreDelProveedor;
    }
}
