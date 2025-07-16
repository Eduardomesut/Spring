package org.example.ejemplo3;

import java.util.ArrayList;

public class Carrera {
    public static void main(String[] args) {
        Relevo relevo = new Relevo();

        for (int i = 1; i <= 4; i++) {
            new Thread(new Corredor(i, relevo)).start();
        }

        // Hilo final para decir que se terminó la carrera
        new Thread(() -> {
            try {
                Thread.sleep(8000); // Espera un poco más que todos los corredores
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            System.out.println("¡Meta alcanzada!");
        }).start();
    }
}
