package com.uco.aplicacionWeb.AplicacionINGTres.infraestructura.adaptador.repositorio.jpa;

import com.uco.aplicacionWeb.AplicacionINGTres.infraestructura.adaptador.entidad.EntidadUsusario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoriaUsuarioJpa extends JpaRepository<EntidadUsusario, Long> {

    EntidadUsusario buscar(String nombre, String apellido, String correo, String password);
}
