package com.curso.modelo.persistencia;

public interface InterfaceDao <E, k>{
    void insertar(E e);
    void eliminar(k k);
    void modificar(E e);
    E buscar(k k);
}
