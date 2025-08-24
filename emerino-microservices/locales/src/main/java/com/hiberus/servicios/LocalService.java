package com.hiberus.servicios;

import com.hiberus.modelos.Local;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface LocalService {

    void guardarLocal(Local local);
    List<Local> obtenerLocales();
    Optional<Local> buscarPorId(Long id);

    //Poner aqui toods los métodos de servicio
}
