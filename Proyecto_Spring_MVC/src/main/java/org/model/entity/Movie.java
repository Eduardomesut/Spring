package org.model.entity;

public class Movie {

    private Long id;
    private String name;
    private String genre;
    private String director;
    private String description;
    private Integer year;
    private String producer;

    public Movie() {
    }

    public Movie(Long id, String name, String genre, String director, String description, Integer year, String producer) {
        this.id = id;
        this.name = name;
        this.genre = genre;
        this.director = director;
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

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
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
