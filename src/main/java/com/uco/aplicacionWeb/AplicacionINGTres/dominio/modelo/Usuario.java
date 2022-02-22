package com.uco.aplicacionWeb.AplicacionINGTres.dominio.modelo;

public class Usuario {

    private final int identificacin;
    private final String nombre;
    private final String apellido;
    private final String correo;
    private final String password;

    public static Usuario of(int identificacin, String nombre, String apellido, String correo,
                             String password) {

        validarDato(identificacin, "La identificación no puede estar vacia");
        validarObligatorio(nombre, "El nombre no puede ser vacio");
        validarObligatorio(apellido, "El apellido no puede ser vacio");
        validarObligatorio(correo, "El correo no puede estar vacio");
        validarObligatorio(password, "La contraseña no puede estar vacia");

        return new Usuario(identificacin, nombre, apellido, correo, password);
    }

    private Usuario(int identificacin, String nombre, String apellido, String correo, String password) {
        this.identificacin = identificacin;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.password = password;
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
