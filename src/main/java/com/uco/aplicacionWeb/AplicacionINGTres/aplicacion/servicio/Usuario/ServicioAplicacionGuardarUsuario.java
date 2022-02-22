package com.uco.aplicacionWeb.AplicacionINGTres.aplicacion.servicio.Usuario;

import com.uco.aplicacionWeb.AplicacionINGTres.aplicacion.dto.DtoUsuario;
import com.uco.aplicacionWeb.AplicacionINGTres.aplicacion.dto.Respuesta.DtoRespuesta;
import com.uco.aplicacionWeb.AplicacionINGTres.dominio.modelo.Usuario;
import com.uco.aplicacionWeb.AplicacionINGTres.dominio.servicio.usuario.ServicioGuardarUsuario;
import org.springframework.stereotype.Component;

@Component
public class ServicioAplicacionGuardarUsuario {

    private final ServicioGuardarUsuario servicioGuardarUsuario;

    public ServicioAplicacionGuardarUsuario(ServicioGuardarUsuario servicioGuardarUsuario) {
        this.servicioGuardarUsuario = servicioGuardarUsuario;
    }

    public DtoRespuesta<Long> ejecutar(DtoUsuario dto) {

        Usuario persona = Usuario.of(dto.getIdentificacin(), dto.getNombre(), dto.getApellido(),
                dto.getCorreo(), dto.getPassword());

        return new DtoRespuesta<>(this.servicioGuardarUsuario.ejecutar(persona));
    }
}
