package com.uco.aplicacionWeb.AplicacionINGTres.aplicacion.dto;

import com.uco.aplicacionWeb.AplicacionINGTres.dominio.modelo.Tamano;

public class DtoTamano {

    private int idTamano;
    private String nombre;
    private String descripcionTamano;

    public DtoTamano() {
    }

    private DtoTamano(int idTamano, String nombre, String descripcionTamano) {
        this.idTamano = idTamano;
        this.nombre = nombre;
        this.descripcionTamano = descripcionTamano;
    }

    public String getNombre() {
        return nombre;
    }

    public int getIdTamano() {
        return idTamano;
    }

    public String getDescripcionTamano() {
        return descripcionTamano;
    }
}
