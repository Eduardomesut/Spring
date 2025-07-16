package org.example.ejemplo3;

public class Corredor implements Runnable {
    private int numero;
    private Relevo relevo;

    public Corredor(int numero, Relevo relevo) {
        this.numero = numero;
        this.relevo = relevo;
    }

    @Override
    public void run() {
        relevo.correr(numero);
    }
}

