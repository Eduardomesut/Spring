package org.example.ejemplo2;

public class Aplicacion {

    public static void main(String[] args) {
        Mensaje mensaje = new Mensaje();
        Productor productor = new Productor("Productor 1", mensaje);
        Productor productor2 = new Productor("Productor 2", mensaje);
        Productor productor3 = new Productor("Productor 3", mensaje);
        Consumidor consumidor = new Consumidor("Consumidor 1", mensaje);
        Consumidor consumidor2 = new Consumidor("Consumidor 2", mensaje);
        Consumidor consumidor3 = new Consumidor("Consumidor 3", mensaje);
        Thread hilo1 = new Thread(productor);
        Thread hilo2 = new Thread(productor2);
        Thread hilo3 = new Thread(productor3);
        Thread hilo4 = new Thread(consumidor);
        Thread hilo5 = new Thread(consumidor2);
        Thread hilo6 = new Thread(consumidor3);
        hilo1.start();
        hilo2.start();
        hilo3.start();
        hilo4.start();
        hilo5.start();
        hilo6.start();



    }
}
