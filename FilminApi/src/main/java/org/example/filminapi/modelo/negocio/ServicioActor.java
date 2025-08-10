package org.example.filminapi.modelo.negocio;

import jakarta.transaction.Transactional;
import org.example.filminapi.modelo.entidad.Actor;
import org.example.filminapi.modelo.persistencia.ActorRepositorio;
import org.example.filminapi.modelo.persistencia.PeliculaRepositorio;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class ServicioActor {
    private ActorRepositorio actorRepositorio;
    public ServicioActor(ActorRepositorio actorRepositorio) {
        this.actorRepositorio = actorRepositorio;
    }
    public List<Actor> obtenerActoresPorPelicula(Long id){
        return null;
        //Hacer

    }

    public List<Actor> obtenerActores(){
        return actorRepositorio.findAll();
    }
}
