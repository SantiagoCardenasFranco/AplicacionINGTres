package com.uco.aplicacionWeb.AplicacionINGTres.dominio.servicio.usuario;

import com.uco.aplicacionWeb.AplicacionINGTres.dominio.modelo.Usuario;
import com.uco.aplicacionWeb.AplicacionINGTres.dominio.puerto.usuario.RepositorioUsuario;
import org.springframework.stereotype.Service;

@Service
public class ServicioActualizarUsuario {

    //private static final String PERSONA_ACTUALIZADA = "NO SE ENCONTRÓ A LA PERSONA O NO EXISTE";

    private final RepositorioUsuario repositorioUsuario;

    public ServicioActualizarUsuario(RepositorioUsuario repositorioUsuario)
    {
        this.repositorioUsuario = repositorioUsuario;
    }

    public Boolean ejecutar(Long id, Usuario usuario){
        //if(this.repositorioPersona.existe(persona)){
        return this.repositorioUsuario.actualizar(id, usuario);
       /* }else
        {
            throw new IllegalStateException(PERSONA_ACTUALIZADA);
        }*/
    }
}
