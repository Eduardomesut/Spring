package com.curso.persistencia;

import com.curso.modelo.entidad.Pelicula;

import java.util.List;

public interface InterfaceDao<T,k> {

    void insertar(T pelicula);
    void actualizar(T pelicula);
    void eliminar(k id);
    void borrar(k id);
    Pelicula obtenerPelicula(k id);
    List<T> obtenerPeliculas();

}
