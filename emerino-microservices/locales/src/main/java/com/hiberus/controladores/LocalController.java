package com.hiberus.controladores;

import com.hiberus.modelos.Local;
import com.hiberus.servicios.LocalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/locales")
public class LocalController {

    @Autowired
    LocalService localService;


    @GetMapping("/all")
    public ResponseEntity<List<Local>> listaLocales(){
        List<Local> locales = localService.obtenerLocales();

        return ResponseEntity.ok(locales);
    }



}
