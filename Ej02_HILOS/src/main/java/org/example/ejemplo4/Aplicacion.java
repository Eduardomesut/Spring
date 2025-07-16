package org.example.ejemplo4;

public class Aplicacion {
    public static void main(String[] args) {
        Cajero cajero = new Cajero();
        Cliente cliente1 = new Cliente(1, 2, cajero);
        Cliente cliente2 = new Cliente(2, 3, cajero);
        Cliente cliente3 = new Cliente(3, 1, cajero);
        Cliente cliente4 = new Cliente(4, 5, cajero);
        Cliente cliente5 = new Cliente(5, 1, cajero);
        Thread hilo1 = new Thread(cliente1);
        Thread hilo2 = new Thread(cliente2);
        Thread hilo3 = new Thread(cliente3);
        Thread hilo4 = new Thread(cliente4);
        Thread hilo5 = new Thread(cliente5);
        hilo1.start();
        hilo2.start();
        hilo3.start();
        hilo4.start();
        hilo5.start();



    }

}
