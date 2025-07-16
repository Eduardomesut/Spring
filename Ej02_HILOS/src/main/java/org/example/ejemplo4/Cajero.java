package org.example.ejemplo4;

public class Cajero {
    private int idConexion = 1;

    public synchronized void realizarConexion(int id, int tiempo) {
        while (this.idConexion != id) {
            try {
                System.out.println("Cliente " + id + " esperando");
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
        System.out.println("Cliente " + id + " conectado");
        try {
            System.out.println("Duración de la conexion: " + tiempo + " segundos");
            Thread.sleep(tiempo * 1000L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Conexion finalizada del cliente " + id );
        this.idConexion++;
        notifyAll();

    }
}
