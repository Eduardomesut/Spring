package com.curso.dao;

import com.curso.modelo.entidad.Pelicula;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;
import java.util.List;
@Repository
public class PeliculaDao {

    @PersistenceContext(unitName = "bbdd_spring_peliculas")
    private EntityManager em;
    public void insertarPelicula(Pelicula pelicula){
        em.persist(pelicula);
    }

    public void eliminarPelicula(Integer id){
        Pelicula pelicula = em.find(Pelicula.class, id);
        em.remove(pelicula);
    }

    public void modificarPelicula(Pelicula pelicula){
        em.merge(pelicula);
    }
    public Pelicula buscarPelicula(Integer id){
        return em.find(Pelicula.class, id);
    }
    public List<Pelicula> listarPeliculas(){
       // return em.createQuery("select p from Pelicula p",Pelicula.class).getResultList();
        return null;
    }

}
