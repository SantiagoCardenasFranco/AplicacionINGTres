package com.uco.aplicacionWeb.AplicacionINGTres.dominio.puerto.caracteristica;

import com.uco.aplicacionWeb.AplicacionINGTres.dominio.modelo.Caracteristica;

import java.util.List;

public interface RepositorioCaracteristica {

    List<Caracteristica> listar();
    Caracteristica consultarPorId(Long id);
    Long guardar(Caracteristica caracteristica);
    boolean existe(Caracteristica caracteristica);
    Long eliminar(Long id);
    Boolean actualizar(Long id, Caracteristica caracteristica);
}
