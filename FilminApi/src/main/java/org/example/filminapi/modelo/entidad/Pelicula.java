package org.example.filminapi.modelo.entidad;

import jakarta.persistence.*;

@Entity
public class Pelicula {
    @Id
    private Long id;
    private String nombre;
    private String genero;
    @ManyToOne
    private Director director;

}
