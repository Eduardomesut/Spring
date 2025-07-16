package org.example.ejemplo2;

public class Consumidor implements Runnable {

    private final String nombre;
    private final Mensaje mensaje;

    public Consumidor(String nombre, Mensaje mensaje) {
        this.nombre = nombre;
        this.mensaje = mensaje;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (mensaje) {
                while (mensaje.estaVacio()) {
                    try {
                        mensaje.wait();  // Libera el bloqueo y espera
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                String recibido = mensaje.recibirMensaje();
                System.out.println(nombre + " consumió: " + recibido);
                mensaje.notifyAll(); // Despierta a productores esperando
            }

            try {
                Thread.sleep(700); // simula tiempo de procesamiento
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
