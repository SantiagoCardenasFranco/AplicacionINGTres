package com.uco.aplicacionWeb.AplicacionINGTres.infraestructura.adaptador.repositorio;

import com.uco.aplicacionWeb.AplicacionINGTres.dominio.modelo.Usuario;
import com.uco.aplicacionWeb.AplicacionINGTres.dominio.puerto.usuario.RepositorioUsuario;
import com.uco.aplicacionWeb.AplicacionINGTres.infraestructura.adaptador.entidad.EntidadUsusario;
import com.uco.aplicacionWeb.AplicacionINGTres.infraestructura.adaptador.repositorio.jpa.RepositoriaUsuarioJpa;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class RepositorioUsuarioPostgresql implements RepositorioUsuario {

    private final RepositoriaUsuarioJpa repositoriaUsuarioJpa;

    public RepositorioUsuarioPostgresql(RepositoriaUsuarioJpa repositoriaUsuarioJpa) {
        this.repositoriaUsuarioJpa = repositoriaUsuarioJpa;
    }

    @Override
    public List<Usuario> listar() {
        List<EntidadUsusario> entidades = this.repositoriaUsuarioJpa.findAll();
        return entidades.stream().map(entidad -> Usuario.of(entidad.getNombre(), entidad.getApellido(),
                entidad.getCorreo(), entidad.getPassword())).toList();
    }

    @Override
    public Usuario consultarPorId(Long id) {
        return this.repositoriaUsuarioJpa
                .findById(id)
                .map(entidad -> Usuario.of(entidad.getNombre(), entidad.getApellido(),
                        entidad.getCorreo(), entidad.getPassword())).orElse(null);
    }

    @Override
    public Long guardar(Usuario usuario) {
        EntidadUsusario entidadUsuario = new EntidadUsusario(usuario.getNombre(), usuario.getApellido(),
                usuario.getCorreo(), usuario.getPassword());

        return this.repositoriaUsuarioJpa.save(entidadUsuario).getIdentificacion();
    }
    @Override
    public boolean existe(Usuario usuario) {
        return this.repositoriaUsuarioJpa.buscar(usuario.getNombre(), usuario.getApellido(), usuario.getCorreo(),
                usuario.getPassword()) != null;
    }

    @Override
    public void eliminiarDos(Long id) {
    }

    @Override
    public Long eliminar(Long id) {
        return null;
    }

    @Override
    public Boolean actualizar(Long id, Usuario usuario) {
        return null;
    }
}
