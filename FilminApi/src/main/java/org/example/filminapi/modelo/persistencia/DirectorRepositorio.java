package org.example.filminapi.modelo.persistencia;

import org.example.filminapi.modelo.entidad.Director;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DirectorRepositorio extends JpaRepository<Director, Long> {
    List<Director> findByNombre(String nombre);
    List<Director> findByNacionalidad(String apellido);
}
