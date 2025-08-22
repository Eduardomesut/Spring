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

    //Ejemplo en blanco que hay que cambiar
    @GetMapping("/all")
    public ResponseEntity<List<Local>> listaLocales(){

        return ResponseEntity.ok(null);
    }



}
