package org.example;

import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {


    public static void main(String[] args) {
        String a = "a";
        String b = "b";
        String c = "c";
        String d = "d";
        ArrayList<String> lista = new ArrayList<>();
        lista.add(a);
        lista.add(b);
        lista.add(c);
        lista.add(d);
        System.out.println(lista);

        //Ejemplo de lamnda en flecha
        lista.forEach(e -> System.out.println(e.toUpperCase()));
        System.out.println("-------------------------------");
        //Aquí con Stream
        lista
                .stream()
                .filter(e -> e.equals("d"))
                .map(String::toUpperCase)
                .forEach(System.out::println);

        //Booleano que tiene que cumplir todo
        System.out.println(lista
                .stream()
                .allMatch(e -> e.equals("d")));

    }


    //Se ve la interfaz de comparable con el método de compareto que devuelve int

    //Tambien se ven las clases comparadoras que implementan Comparator

    //Vemos los opcionales
/*
    Formateador f1 = new Formateador(){
        @Override
        public String formatear(String cadena){
            return cadena.toUpperCase();
        }


    };

*/



}