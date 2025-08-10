package org.example.filminapi.modelo.persistencia;

import org.example.filminapi.modelo.entidad.Actor;
import org.example.filminapi.modelo.entidad.Pelicula;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ActorRepositorio extends JpaRepository<Actor, Long> {


    List<Actor> findAllByPeliculas(List<Pelicula> peliculas);
    List<Actor> findByPeliculasNombre(String nombrePelicula);
}
