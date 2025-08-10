package org.example.filminapi.modelo.negocio;

import jakarta.transaction.Transactional;
import org.example.filminapi.modelo.entidad.Actor;
import org.example.filminapi.modelo.persistencia.ActorRepositorio;
import org.example.filminapi.modelo.persistencia.PeliculaRepositorio;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
@Transactional
public class ServicioActor {
    private ActorRepositorio actorRepositorio;
    public ServicioActor(ActorRepositorio actorRepositorio) {
        this.actorRepositorio = actorRepositorio;

    }
    public List<Actor> obtenerActoresPorPelicula(@PathVariable String nombrePelicula){
        if (!actorRepositorio.findByPeliculasNombre(nombrePelicula).isEmpty()){

            List<Actor>actores = actorRepositorio.findByPeliculasNombre(nombrePelicula);

            return actores;
        }
        return null;
    }

    public List<Actor> obtenerActores(){
        return actorRepositorio.findAll();
    }
}
