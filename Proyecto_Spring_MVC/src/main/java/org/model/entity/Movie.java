package org.model.entity;


import jakarta.persistence.*;

@Entity
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String genre;
    //Relaciones
    @ManyToOne()
    @JoinColumn(name = "fk_director_id", referencedColumnName = "id")
    private Director director;
    private String description;
    private Integer year;
    private String producer;

    public Movie() {
    }

    public Movie(Long id, String name, String genre, String description, Integer year, String producer) {
        this.id = id;
        this.name = name;
        this.genre = genre;

        this.description = description;
        this.year = year;
        this.producer = producer;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }
}
