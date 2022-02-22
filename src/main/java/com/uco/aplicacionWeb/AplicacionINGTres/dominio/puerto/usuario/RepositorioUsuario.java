package com.uco.aplicacionWeb.AplicacionINGTres.dominio.puerto.usuario;

import com.uco.aplicacionWeb.AplicacionINGTres.dominio.modelo.Usuario;

import java.util.List;

public interface RepositorioUsuario {

    List<Usuario> listar();
    Usuario consultarPorId(Long id);
    Long guardar(Usuario usuario);
    boolean existe(Usuario usuario);
    void eliminiarDos(Long id);
    Long eliminar(Long id);
    Boolean actualizar(Long id, Usuario usuario);
}
