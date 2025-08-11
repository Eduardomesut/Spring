package org.example.filminapi.modelo.persistencia;

import org.example.filminapi.modelo.entidad.Actor;
import org.example.filminapi.modelo.entidad.Pelicula;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

public interface ActorRepositorio extends JpaRepository<Actor, Long> {


    List<Actor> findAllByApellido(String apellido);
    List<Actor> findAllByNacionalidad(String pais);
}
