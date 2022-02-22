package com.uco.aplicacionWeb.AplicacionINGTres.aplicacion.dto;

public class DtoProducto {

    private int idProducto;
    private String nombre;
    private String descripcion;
    private DtoCaracteristica dtoCaracteristica;
    private DtoTamano dtoTamano;
    private DtoUsuario dtoUsuario;

    public DtoProducto() {
    }

    private DtoProducto(int idProducto, String nombre, String descripcion, DtoCaracteristica dtoCaracteristica,
                        DtoTamano dtoTamano, DtoUsuario usuario) {
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.dtoCaracteristica = dtoCaracteristica;
        this.dtoTamano = dtoTamano;
        this.dtoUsuario = dtoUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public DtoCaracteristica getDtoCaracteristica() {
        return dtoCaracteristica;
    }

    public DtoTamano getDtoTamano() {
        return dtoTamano;
    }

    public DtoUsuario getDtoUsuario() {
        return dtoUsuario;
    }
}
