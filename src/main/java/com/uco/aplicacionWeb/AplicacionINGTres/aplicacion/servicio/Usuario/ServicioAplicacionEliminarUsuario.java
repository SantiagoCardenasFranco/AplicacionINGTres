package com.uco.aplicacionWeb.AplicacionINGTres.aplicacion.servicio.Usuario;

import com.uco.aplicacionWeb.AplicacionINGTres.aplicacion.dto.Respuesta.DtoRespuesta;
import com.uco.aplicacionWeb.AplicacionINGTres.dominio.servicio.usuario.ServicioEliminarUsuario;
import org.springframework.stereotype.Component;

@Component
public class ServicioAplicacionEliminarUsuario {

    private final ServicioEliminarUsuario servicioEliminarUsuario;

    public ServicioAplicacionEliminarUsuario(ServicioEliminarUsuario servicioEliminarUsuario) {
        this.servicioEliminarUsuario = servicioEliminarUsuario;
    }

    public DtoRespuesta<Long> ejecutar(Long id) {
        return new DtoRespuesta<>(this.servicioEliminarUsuario.ejecutar(id));
    }
}
