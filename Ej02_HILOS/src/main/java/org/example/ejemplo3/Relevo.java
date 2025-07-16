package org.example.ejemplo3;

public class Relevo {
    private int turno = 1; // Comienza el corredor 1

    public synchronized void correr(int numeroCorredor) {
        while (numeroCorredor != turno) {
            try {
                wait(); // Espera hasta que sea su turno
                System.out.println("Corredor " + numeroCorredor + " esperando...");
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        System.out.println("Corredor " + numeroCorredor + " comienza su tramo...");

        try {
            Thread.sleep((long) (1000 + Math.random() * 2000)); // Simula tiempo de carrera (1-3s)
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println("Corredor " + numeroCorredor + " ha terminado.");

        turno++; // Da el testigo al siguiente
        notifyAll(); // Despierta a todos por si alguno es el siguiente
    }
}


