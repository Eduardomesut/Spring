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
    public void guardarActor(Actor actor){
        actorRepositorio.save(actor);
    }
    public Actor obtenerActorPorId(Long id){
        return actorRepositorio.findById(id).orElse(null);
    }
    public Iterable<Actor> obtenerActoresPorNombre(String nombre){
        if (!actorRepositorio.findAllByApellido(nombre).isEmpty()){
            List<Actor>actores = actorRepositorio.findAllByApellido(nombre);
            return actores;
        }
        return null;
    }
    public List<Actor> obtenerActoresPorNacionalidad(String pais){
        if (!actorRepositorio.findAllByNacionalidad(pais).isEmpty()){

            List<Actor>actores = actorRepositorio.findAllByNacionalidad(pais);

            return actores;
        }
        return null;
    }

    public List<Actor> obtenerActores(){
        return actorRepositorio.findAll();
    }
}
