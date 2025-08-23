package com.hiberus.config;

import com.hiberus.modelos.Local;
import com.hiberus.repositorios.LocalRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class ConfigData {
    @Bean("ConfigData")
    CommandLineRunner commandLineRunner(LocalRepository localRepository){
        return args -> {
            Local local1 = Local.builder()
                    .nombre("Zara")
                    .direccion("Calle Madrid")
                    .telefono("657445654")
                    .ingresosTotales(5847584.0)
                    .numTrabajadores(20)
                    .build();

            Local local2 = Local.builder()
                    .nombre("Ralph Lauren")
                    .direccion("Calle Delicias")
                    .telefono("651111654")
                    .ingresosTotales(9987676.4)
                    .numTrabajadores(22)
                    .build();

            Local local3 = Local.builder()
                    .nombre("Zara")
                    .direccion("Calle Murcia")
                    .telefono("612345654")
                    .ingresosTotales(123223.0)
                    .numTrabajadores(11)
                    .build();

            localRepository.saveAll(List.of(local1,local2,local3));


        };


    }
}
