package com.uco.aplicacionWeb.AplicacionINGTres.infraestructura.controlador;

import com.uco.aplicacionWeb.AplicacionINGTres.aplicacion.dto.DtoUsuario;
import com.uco.aplicacionWeb.AplicacionINGTres.aplicacion.dto.Respuesta.DtoRespuesta;
import com.uco.aplicacionWeb.AplicacionINGTres.aplicacion.servicio.Usuario.ServicioAplicacionGuardarUsuario;
import com.uco.aplicacionWeb.AplicacionINGTres.aplicacion.servicio.Usuario.ServicioAplicacionListarUsuario;
import com.uco.aplicacionWeb.AplicacionINGTres.dominio.modelo.Usuario;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/usuarios")
public class ControladorUsuario {

    private final ServicioAplicacionListarUsuario servicioListarUsuarios;
    private final ServicioAplicacionGuardarUsuario servicioGuardarUsuario;

    public ControladorUsuario(ServicioAplicacionListarUsuario servicioListarUsuarios,
                              ServicioAplicacionGuardarUsuario servicioGuardarUsuario) {
        this.servicioListarUsuarios = servicioListarUsuarios;
        this.servicioGuardarUsuario = servicioGuardarUsuario;
    }

    @GetMapping
    public List<Usuario> listar() {
        return servicioListarUsuarios.ejecutar();
    }

    @PostMapping
    public DtoRespuesta<Long> crear(@RequestBody DtoUsuario dto) {
        return this.servicioGuardarUsuario.ejecutar(dto);
    }
}
