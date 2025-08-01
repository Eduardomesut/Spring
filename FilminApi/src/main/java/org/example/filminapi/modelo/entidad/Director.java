package org.example.filminapi.modelo.entidad;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
public class Director {
    @Id
    private Long id;
    private String nombre;

    //Mirar si esto es correcto
    @OneToMany(mappedBy = "id")
    private List<Pelicula> peliculas;
}
