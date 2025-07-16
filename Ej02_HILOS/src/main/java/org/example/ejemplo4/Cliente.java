package org.example.ejemplo4;

public class Cliente implements Runnable{
    private int idCliente;
    private int segundosConexion;
    private Cajero cajero;

    public Cliente(int idCliente, int segundosConexion, Cajero cajero) {
        this.idCliente = idCliente;
        this.segundosConexion = segundosConexion;
        this.cajero = cajero;
    }


    @Override
    public void run() {
        cajero.realizarConexion(idCliente, segundosConexion);

    }
}
