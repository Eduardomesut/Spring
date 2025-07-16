package org.example.ejemplo1;

public class Caballo implements Runnable {

    private String nombre;
    private Meta meta;

    public Caballo(String nombre, Meta meta){

        this.nombre = nombre;
        this.meta = meta;
    }

    @Override
    public void run(){

            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            meta.agregar(this);



    }
    public String getNombre(){
        return nombre;
    }
}
