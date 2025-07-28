package org.model.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Director {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @OneToMany(mappedBy = "director")
    List<Movie> movies;
    //Prácticamente no se usa

    @Embedded
    private Direction direction;

    //Relaciones
}
