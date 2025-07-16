package org.example.ejemplo2;

import java.util.LinkedList;

public class Mensaje {

    private final LinkedList<String> mensajes = new LinkedList<>();

    public void mandarMensaje(String mensaje) {
        mensajes.add(mensaje);
    }

    public String recibirMensaje() {
        return mensajes.poll();
    }

    public boolean estaLleno() {
        return mensajes.size() > 10;
    }

    public boolean estaVacio() {
        return mensajes.isEmpty();
    }
}

