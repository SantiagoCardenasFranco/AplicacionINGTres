package com.uco.aplicacionWeb.AplicacionINGTres.infraestructura.adaptador;

import com.uco.aplicacionWeb.AplicacionINGTres.dominio.modelo.Usuario;
import com.uco.aplicacionWeb.AplicacionINGTres.dominio.puerto.RepositorioUsuario;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Repository
public class RepositorioEnMemoria implements RepositorioUsuario {

    private long secuencia;
    private final HashMap<Long, Usuario> usuarios = new HashMap<>();

    @Override
    public List<Usuario> listar() {
        return new ArrayList<>(usuarios.values());
    }

    @Override
    public Usuario consultarPorId(Long id) {
        return usuarios.get(id);
    }

    @Override
    public Long guardar(Usuario usuario) {
        usuarios.put(++secuencia, usuario);
        return secuencia;
    }

    @Override
    public boolean existe(Usuario usuario) {
        return listar().stream().anyMatch(row -> row.toString().equals(usuario.toString()));
    }
}
