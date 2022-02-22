package com.uco.aplicacionWeb.AplicacionINGTres.dominio.modelo;

public class Producto {

    private final int idProducto;
    private final String nombre;
    private final String descripcion;
    private final Caracteristica caracteristica;
    private final Tamano tamano;
    private final Usuario usuario;

    public static Producto of(int idProducto, String nombre, String descripcion, Caracteristica caracteristica,
                             Tamano tamano, Usuario usuario) {

        validarDato(idProducto, "La identificación no puede estar vacia");
        validarObligatorio(nombre, "El nombre no puede ser vacio");
        validarObligatorio(descripcion, "La descripción no puede estar vacia");
        validarObjeto(caracteristica, "La caracteristica de un producto no puede estar vacio");
        validarObjeto(tamano, "El tamaño de un producto no puede estar vacio");
        validarObjeto(usuario, "Un producto siempre es ingresado por un usuario");

        return new Producto(idProducto, nombre, descripcion, caracteristica, tamano, usuario);
    }

    private Producto(int idProducto, String nombre, String descripcion, Caracteristica caracteristica,
                     Tamano tamano, Usuario usuario) {
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.caracteristica = caracteristica;
        this.tamano = tamano;
        this.usuario = usuario;
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

    private static void validarObjeto(Object valor, String mensaje) {
        if(valor == null) {
            throw new IllegalArgumentException(mensaje);
        }
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

    public Usuario getUsuario() {
        return usuario;
    }

    public Caracteristica getCaracteristica() {
        return caracteristica;
    }

    public Tamano getTamano() {
        return tamano;
    }
}
