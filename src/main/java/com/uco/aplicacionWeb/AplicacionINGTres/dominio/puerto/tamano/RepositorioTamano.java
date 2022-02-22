package com.uco.aplicacionWeb.AplicacionINGTres.dominio.puerto.tamano;

import com.uco.aplicacionWeb.AplicacionINGTres.dominio.modelo.Tamano;

import java.util.List;

public interface RepositorioTamano {

    List<Tamano> listar();
    Tamano consultarPorId(Long id);
    Long guardar(Tamano tamano);
    boolean existe(Tamano tamano);
    Boolean actualizar(Long id, Tamano tamano);
}
