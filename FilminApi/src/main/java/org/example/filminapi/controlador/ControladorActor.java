package org.example.filminapi.controlador;

import org.example.filminapi.modelo.entidad.Actor;
import org.example.filminapi.modelo.negocio.ServicioActor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
    @GetMapping("/actores/pelicula/{nombrePais}")
    public ResponseEntity<List<Actor>> obtenerActoresPorPelicula(@PathVariable String pais){
        List<Actor> actores = servicioActor.obtenerActoresPorNacionalidad(pais);
        return ResponseEntity.ok(actores);
    }
    @PostMapping("/actores")
    public ResponseEntity<Actor> crearActor(@PathVariable Actor actor){
        servicioActor.guardarActor(actor);
        return ResponseEntity.ok(actor);
    }
    @GetMapping("/actores/{id}")
    public ResponseEntity<Actor> obtenerActorPorId(@PathVariable Long id){
        Actor actor = servicioActor.obtenerActorPorId(id);
        return ResponseEntity.ok(actor);
    }
    @DeleteMapping("/actores/{id}")
    public ResponseEntity<Object> eliminarActor(@PathVariable Long id){
        servicioActor.eliminarActor(id);
        return ResponseEntity.ok().build();
    }
}
