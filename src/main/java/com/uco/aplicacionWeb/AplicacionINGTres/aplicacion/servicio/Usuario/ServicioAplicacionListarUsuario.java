package com.uco.aplicacionWeb.AplicacionINGTres.aplicacion.servicio.Usuario;

import com.uco.aplicacionWeb.AplicacionINGTres.dominio.modelo.Usuario;
import com.uco.aplicacionWeb.AplicacionINGTres.dominio.puerto.usuario.RepositorioUsuario;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ServicioAplicacionListarUsuario {

    private final RepositorioUsuario repositorioUsuario;

    public ServicioAplicacionListarUsuario(RepositorioUsuario repositorioUsuario) {
        this.repositorioUsuario = repositorioUsuario;
    }

    public List<Usuario> ejecutar() {
        return this.repositorioUsuario.listar();
    }
}
