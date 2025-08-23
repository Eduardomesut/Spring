package com.hiberus.servicios.impl;

import com.hiberus.modelos.Local;
import com.hiberus.repositorios.LocalRepository;
import com.hiberus.servicios.LocalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocalServiceImplements implements LocalService {

    @Autowired
    LocalRepository localRepository;

    @Override
    public void guardarLocal(Local local) {
        localRepository.save(local);

    }

    @Override
    public List<Local> obtenerLocales() {
        List<Local> locales = localRepository.findAll();
        return locales;
    }
}
