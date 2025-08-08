package org.example.filminapi.modelo.entidad;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

import java.util.List;
//Prueba
@Entity
public class Pelicula {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotEmpty
    private String titulo;
    private String genero;
    @ManyToOne
    @JoinColumn(name = "fk_director_id")
    private Director director;
    @ManyToMany(mappedBy = "peliculas")
    private List<Actor> actores;
    private Integer estreno;
    private Double notaMedia;

    public Pelicula() {
        super();
    }

    public Pelicula(Long id, String titulo, String genero, Director director, List<Actor> actores, Integer estreno, Double notaMedia) {
        this.id = id;
        this.titulo = titulo;
        this.genero = genero;
        this.director = director;
        this.actores = actores;
        this.estreno = estreno;
        this.notaMedia = notaMedia;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String nombre) {
        this.titulo = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public List<Actor> getActores() {
        return actores;
    }

    public void setActores(List<Actor> actores) {
        this.actores = actores;
    }

    public Integer getEstreno() {
        return estreno;
    }

    public void setEstreno(Integer estreno) {
        this.estreno = estreno;
    }

    public Double getNotaMedia() {
        return notaMedia;
    }

    public void setNotaMedia(Double notaMedia) {
        this.notaMedia = notaMedia;
    }
}
