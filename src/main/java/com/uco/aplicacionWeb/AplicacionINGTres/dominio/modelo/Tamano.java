package com.uco.aplicacionWeb.AplicacionINGTres.dominio.modelo;

public class Tamano {

    private final int idTamano;
    private final String nombre;
    private final String descripcionTamano;


    public static Tamano of(int idTamano, String nombre, String descripcionTamano) {

        validarDato(idTamano, "La identificación no puede estar vacia");
        validarObligatorio(nombre, "El nombre no puede ser vacio");
        validarObligatorio(descripcionTamano, "La descripcion del tamaño no puede estar vacia");

        return new Tamano(idTamano, nombre, descripcionTamano);
    }

    private Tamano(int idTamano, String nombre, String descripcionTamano) {
        this.idTamano = idTamano;
        this.nombre = nombre;
        this.descripcionTamano = descripcionTamano;
    }

    private static void validarObligatorio(String valor, String mensaje) {
        if(valor == null || valor.isBlank()) {
            throw new IllegalArgumentException(mensaje);
        }
    }

    private static void validarDato(int valor, String mensaje) {
        String numeroACadena = String.valueOf(valor);
        if(numeroACadena.isBlank()) {
            throw new IllegalArgumentException(mensaje);
        }
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
