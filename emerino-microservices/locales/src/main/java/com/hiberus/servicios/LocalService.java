package com.hiberus.servicios;

import com.hiberus.modelos.Local;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface LocalService {

    void guardarLocal(Local local);
    List<Local> obtenerLocales();


    //Poner aqui toods los métodos de servicio
}
