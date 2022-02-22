package com.uco.aplicacionWeb.AplicacionINGTres.infraestructura.controlador;

import com.uco.aplicacionWeb.AplicacionINGTres.aplicacion.dto.DtoUsuario;
import com.uco.aplicacionWeb.AplicacionINGTres.aplicacion.dto.Respuesta.DtoRespuesta;
import com.uco.aplicacionWeb.AplicacionINGTres.aplicacion.servicio.Usuario.ServicioAplicacionActualizarUsuario;
import com.uco.aplicacionWeb.AplicacionINGTres.aplicacion.servicio.Usuario.ServicioAplicacionEliminarUsuario;
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
    private final ServicioAplicacionEliminarUsuario servicioEliminarUsuario;
    private final ServicioAplicacionActualizarUsuario servicioAplicacionActualizarUsuario;

    public ControladorUsuario(ServicioAplicacionListarUsuario servicioListarUsuarios,
                              ServicioAplicacionGuardarUsuario servicioGuardarUsuario,
                              ServicioAplicacionEliminarUsuario servicioEliminarUsuario,
                              ServicioAplicacionActualizarUsuario servicioAplicacionActualizarUsuario) {
        this.servicioListarUsuarios = servicioListarUsuarios;
        this.servicioGuardarUsuario = servicioGuardarUsuario;
        this.servicioEliminarUsuario = servicioEliminarUsuario;
        this.servicioAplicacionActualizarUsuario = servicioAplicacionActualizarUsuario;
    }

    @GetMapping
    public List<Usuario> listar() {
        return servicioListarUsuarios.ejecutar();
    }

    @PostMapping
    public DtoRespuesta<Long> crear(@RequestBody DtoUsuario dto) {
        return this.servicioGuardarUsuario.ejecutar(dto);
    }

    @DeleteMapping(value = "/{id}")
    public DtoRespuesta<Long> eliminar(@PathVariable Long id) {
        return this.servicioEliminarUsuario.ejecutar(id);
    }

    @PutMapping(value = "/{id}")
    public DtoRespuesta<Boolean> actualizar(@PathVariable Long id, @RequestBody DtoUsuario dto) {
        return this.servicioAplicacionActualizarUsuario.ejecutar(id, dto);
    }
}

