package org.example.filminapi.modelo.negocio;

import jakarta.transaction.Transactional;
import org.example.filminapi.modelo.entidad.Pelicula;
import org.example.filminapi.modelo.persistencia.PeliculaRepositorio;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ServicioPelicula {
    private PeliculaRepositorio peliculaRepositorio;

    public ServicioPelicula(PeliculaRepositorio peliculaRepositorio) {
        this.peliculaRepositorio = peliculaRepositorio;
    }

    public void guardarPelicula(Pelicula pelicula){

            peliculaRepositorio.save(pelicula);


    }
    public Pelicula obtenerPeliculaPorId(Long id){
        return peliculaRepositorio.findById(id).orElse(null);
    }
    public Iterable<Pelicula> obtenerTodasLasPeliculas(){
        return peliculaRepositorio.findAll();
    }
    public void eliminarPelicula(Long id){
        peliculaRepositorio.deleteById(id);
    }
    public Iterable<Pelicula> obtenerPeliculasPorNombreDirector(String nombre){
        return peliculaRepositorio.findByDirector_Nombre(nombre);
    }
    public Iterable<Pelicula> obtenerPeliculasPorGenero(String genero){
        return peliculaRepositorio.findByGenero(genero);
    }
    public Iterable<Pelicula> obtenerPeliculasPorDirector(String director){
        return peliculaRepositorio.findByDirector_Nombre(director);
    }

}
