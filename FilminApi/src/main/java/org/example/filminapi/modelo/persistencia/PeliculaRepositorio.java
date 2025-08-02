package org.example.filminapi.modelo.persistencia;

import org.example.filminapi.modelo.entidad.Pelicula;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PeliculaRepositorio extends JpaRepository<Pelicula, Long> {

    List<Pelicula> findByTitulo(String titulo);
    List<Pelicula> findByGenero(String genero);
    List<Pelicula> findByDirector_Nombre(String director);




}
