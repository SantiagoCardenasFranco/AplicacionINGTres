package com.uco.aplicacionWeb.AplicacionINGTres.dominio.puerto.producto;

import com.uco.aplicacionWeb.AplicacionINGTres.dominio.modelo.Producto;

import java.util.List;

public interface RepositorioProducto {

    List<Producto> listar();
    Producto consultarPorId(Long id);
    Long guardar(Producto producto);
    boolean existe(Producto producto);
    Long eliminar(Long id);
    Boolean actualizar(Long id, Producto producto);
}
