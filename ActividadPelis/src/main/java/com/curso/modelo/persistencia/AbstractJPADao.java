package com.curso.modelo.persistencia;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.lang.reflect.ParameterizedType;

public abstract class AbstractJPADao <E,k>{
    @PersistenceContext(unitName = "bbdd_spring_peliculas")
    protected EntityManager em;

    @SuppressWarnings("unchecked")
    private Class<E> tipo = (Class<E>) ((ParameterizedType) getClass()
            .getGenericSuperclass())
            .getActualTypeArguments()[0];

    public void insertar (E entidad){
        em.persist(entidad);
    }
    public void eliminar (k k){
        E entidad = em.find(tipo, k);
        em.remove(entidad);
    }
    public void modificar (E entidad){
        em.merge(entidad);
    }
    public E buscar (k k){
        return em.find(tipo, k);
    }

}
