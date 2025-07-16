package org.example.ejemplo1;

import java.util.ArrayList;

public class Meta {

    private ArrayList<Caballo> caballos;

    public Meta(){
        caballos = new ArrayList<>();
    }
    public synchronized void agregar(Caballo c){
        System.out.println("El caballo " + c.getNombre() + " se ha agregado en la posición " + caballos.size());

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        caballos.add(c);
    }
    public ArrayList<Caballo> getCaballos(){
        return caballos;
    }


}
