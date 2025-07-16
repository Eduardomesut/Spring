package org.example.ejemplo1;

import java.util.ArrayList;

public class Carrera {

    public static void main(String[] args) {
        Meta meta = new Meta();

        Caballo c1 = new Caballo("Caballo 1", meta);
        Caballo c2 = new Caballo("Caballo 2", meta);
        Caballo c3 = new Caballo("Caballo 3", meta);


        Thread hilo1 = new Thread(c1);
        Thread hilo2 = new Thread(c2);
        Thread hilo3 = new Thread(c3);
        hilo1.start();
        hilo2.start();
        hilo3.start();

        try {
            Thread.sleep(5000);
            ArrayList<Caballo> caballos = meta.getCaballos();
            for (Caballo caballo : caballos) {
                System.out.println("El caballo " + caballo.getNombre() + " ha terminado");
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }
}
