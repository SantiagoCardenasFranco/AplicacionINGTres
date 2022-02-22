package com.uco.aplicacionWeb.AplicacionINGTres.aplicacion.servicio.Usuario;

import com.uco.aplicacionWeb.AplicacionINGTres.aplicacion.dto.DtoUsuario;
import com.uco.aplicacionWeb.AplicacionINGTres.aplicacion.dto.Respuesta.DtoRespuesta;
import com.uco.aplicacionWeb.AplicacionINGTres.dominio.modelo.Usuario;
import com.uco.aplicacionWeb.AplicacionINGTres.dominio.servicio.usuario.ServicioActualizarUsuario;
import org.springframework.stereotype.Component;

@Component
public class ServicioAplicacionActualizarUsuario {

    private final ServicioActualizarUsuario servicioActualizarUsuario;

    public ServicioAplicacionActualizarUsuario(ServicioActualizarUsuario servicioActualizarUsuario) {
        this.servicioActualizarUsuario = servicioActualizarUsuario;
    }

    public DtoRespuesta<Boolean> ejecutar(Long id, DtoUsuario dto) {
        Usuario persona = Usuario.of(dto.getNombre(), dto.getApellido(), dto.getCorreo(),
                dto.getPassword());
        return new DtoRespuesta<>(this.servicioActualizarUsuario.ejecutar(id,persona));
    }
}
