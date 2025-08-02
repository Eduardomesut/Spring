package org.example.filminapi.controlador;

import org.example.filminapi.modelo.entidad.Pelicula;
import org.example.filminapi.modelo.negocio.ServicioPelicula;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ControladorPelicula {

    private ServicioPelicula servicioPelicula;
    public ControladorPelicula(ServicioPelicula servicioPelicula) {
        this.servicioPelicula = servicioPelicula;
    }
    @PostMapping("/peliculas")
    public ResponseEntity<Pelicula> insertarPelicula(@RequestBody Pelicula pelicula){
        servicioPelicula.guardarPelicula(pelicula);
        return ResponseEntity.ok(pelicula);
    }
    @GetMapping("/peliculas")
    public ResponseEntity<Iterable<Pelicula>> obtenerTodasLasPeliculas(){
        return ResponseEntity.ok(servicioPelicula.obtenerTodasLasPeliculas());
    }


}
