package org.example.ejemplo2;

public class Productor implements Runnable {

    private final String nombre;
    private final Mensaje mensaje;

    public Productor(String nombre, Mensaje mensaje) {
        this.nombre = nombre;
        this.mensaje = mensaje;
    }

    @Override
    public void run() {
        //Esto es que sea infinito
        while (true) {
            synchronized (mensaje) {
                while (mensaje.estaLleno()) {
                    try {
                        mensaje.wait();  // Libera el bloqueo y espera
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                mensaje.mandarMensaje("Mensaje del " + nombre);
                System.out.println(nombre + " produjo un mensaje.");
                mensaje.notifyAll(); // Despierta a consumidores esperando
            }

            try {
                Thread.sleep(500); // para evitar saturar el buffer
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
