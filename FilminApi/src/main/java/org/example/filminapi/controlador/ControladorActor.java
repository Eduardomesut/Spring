package org.example.filminapi.controlador;

import org.example.filminapi.modelo.entidad.Actor;
import org.example.filminapi.modelo.negocio.ServicioActor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ControladorActor {

    private ServicioActor servicioActor;
    public ControladorActor(ServicioActor servicioActor) {
        this.servicioActor = servicioActor;
    }
    @GetMapping("/actores")
    public ResponseEntity<List<Actor>> obtenerActores(){
        List<Actor> actores = servicioActor.obtenerActores();
        return ResponseEntity.ok(actores);
    }
    @GetMapping("/actores/pelicula/{nombrePelicula}")
    public ResponseEntity<List<Actor>> obtenerActoresPorPelicula(@PathVariable String nombrePelicula){
        List<Actor> actores = servicioActor.obtenerActoresPorPelicula(nombrePelicula);
        return ResponseEntity.ok(actores);
    }
}
