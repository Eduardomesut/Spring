package com.curso;


import org.h2.Driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Aplicacion {

    public static void main(String[] args) throws SQLException {
        Connection cx = DriverManager.getConnection("jdbc:h2:C:/H2/bbdd_peliculas_2025","sa", "");


        //PONER PATRON SINGLETON


    }
}
