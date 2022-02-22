package com.uco.aplicacionWeb.AplicacionINGTres.dominio.modelo.validaciones;

public class Validaciones {

    public static void validarObligatorio(String valor, String mensaje) {
        if(valor == null || valor.isBlank()) {
            throw new IllegalArgumentException(mensaje);
        }
    }

    public static void validarDato(int valor, String mensaje) {
        String numeroACadena = String.valueOf(valor);
        if(numeroACadena.isBlank()) {
            throw new IllegalArgumentException(mensaje);
        }
    }
}
