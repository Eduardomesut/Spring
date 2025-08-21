package com.hiberus.servicios.impl;

import com.hiberus.repositorios.LocalRepository;
import com.hiberus.servicios.LocalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LocalServiceImplements implements LocalService {

    @Autowired
    LocalRepository localRepository;

    @Override
    public void guardarLocal() {
        //Implementar el save
    }
}
