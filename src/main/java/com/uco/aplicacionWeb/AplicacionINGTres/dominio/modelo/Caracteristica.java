package com.uco.aplicacionWeb.AplicacionINGTres.dominio.modelo;

public class Caracteristica {

    private final int idCiudad;
    private final String nombre;
    private final String nombreDelProveedor;


    public static Caracteristica of(int idCiudad, String nombre, String nombreDelProveedor) {

        validarDato(idCiudad, "La identificación no puede estar vacia");
        validarObligatorio(nombre, "El nombre no puede ser vacio");
        validarObligatorio(nombreDelProveedor, "El nombre del proveedor no puede estar vacia");

        return new Caracteristica(idCiudad, nombre, nombreDelProveedor);
    }

    private Caracteristica(int idCiudad, String nombre, String nombreDelProveedor) {
        this.idCiudad = idCiudad;
        this.nombre = nombre;
        this.nombreDelProveedor = nombreDelProveedor;
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

    public int getIdCiudad() {
        return idCiudad;
    }

    public String getNombreDelProveedor() {
        return nombreDelProveedor;
    }
}
