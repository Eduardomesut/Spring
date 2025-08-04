package org.example.filminapi.controlador;

import jakarta.validation.Valid;
import org.example.filminapi.modelo.entidad.Pelicula;
import org.example.filminapi.modelo.negocio.ServicioPelicula;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;


@RestController
public class ControladorPelicula {

    private ServicioPelicula servicioPelicula;
    public ControladorPelicula(ServicioPelicula servicioPelicula) {
        this.servicioPelicula = servicioPelicula;
    }
    @PostMapping("/peliculas")
    public ResponseEntity<Pelicula> insertarPelicula(@Valid @RequestBody Pelicula pelicula, BindingResult result){
        if(result.hasErrors()){

            //Retornar los errores pertinantes
        }
        servicioPelicula.guardarPelicula(pelicula);
        return ResponseEntity.ok(pelicula);
    }
    @GetMapping("/peliculas")
    public ResponseEntity<Iterable<Pelicula>> obtenerTodasLasPeliculas(){
        return ResponseEntity.ok(servicioPelicula.obtenerTodasLasPeliculas());
    }
    @DeleteMapping("/peliculas/{id}")
    public ResponseEntity<Object> eliminarPelicula(@PathVariable Long id){
        servicioPelicula.eliminarPelicula(id);
        return null;
    }


}
