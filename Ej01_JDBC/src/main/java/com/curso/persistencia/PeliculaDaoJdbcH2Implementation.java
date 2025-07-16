package com.curso.persistencia;

import com.curso.modelo.entidad.Pelicula;

import java.sql.*;
import java.util.List;

public class PeliculaDaoJdbcH2Implementation implements PeliculaDao{
    @Override
    public void insertar(Pelicula pelicula) {
        try (Connection cx = DriverManager.getConnection("jdbc:h2:C:/H2/bbdd_peliculas_20025","sa", "");){


           // Statement st = cx.createStatement();
          //  st.executeUpdate("insert into PELICULAS (TITULO, DIRECTOR, GENERO, YEAR) values ('"+pelicula.getTitulo()+"','','',,)");
            PreparedStatement pst = cx.prepareStatement("INSERT INTO PELICULAS (TITULO, DIRECTOR, GENERO, YEAR) VALUES (?, ?, ?, ?);");
            pst.setString(1, pelicula.getTitulo());
            pst.setString(2, pelicula.getDirector());
            pst.setString(3, pelicula.getGenero());
            pst.setInt(4, pelicula.getYear());
            pst.executeUpdate();

            cx.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public void actualizar(Pelicula pelicula) {

        try (Connection cx = DriverManager.getConnection("jdbc:h2:C:/H2/bbdd_peliculas_20025","sa", "");){


            // Statement st = cx.createStatement();
            //  st.executeUpdate("insert into PELICULAS (TITULO, DIRECTOR, GENERO, YEAR) values ('"+pelicula.getTitulo()+"','','',,)");
            PreparedStatement pst = cx.prepareStatement("UPDATE PELICULAS SET TITULO=? , DIRECTOR=?, GENERO=?, YEAR=? WHERE id=?");
            pst.setString(1, pelicula.getTitulo());
            pst.setString(2, pelicula.getDirector());
            pst.setString(3, pelicula.getGenero());
            pst.setInt(4, pelicula.getYear());
            pst.setInt(5, pelicula.getId());
            pst.executeUpdate();

            cx.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void eliminar(Integer id) {

        try (Connection cx = DriverManager.getConnection("jdbc:h2:C:/H2/bbdd_peliculas_20025","sa", "");){


            // Statement st = cx.createStatement();
            //  st.executeUpdate("insert into PELICULAS (TITULO, DIRECTOR, GENERO, YEAR) values ('"+pelicula.getTitulo()+"','','',,)");
            PreparedStatement pst = cx.prepareStatement("DELETE FROM PELICULAS WHERE id=?");

            pst.setInt(1, id);

            pst.executeUpdate();

            cx.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public void borrar(Integer id) {

    }

    @Override
    public Pelicula obtenerPelicula(Integer id) {
        Pelicula pelicula = null;
        try (Connection cx = DriverManager.getConnection("jdbc:h2:C:/H2/bbdd_peliculas_2025","sa", "");){


            // Statement st = cx.createStatement();
            //  st.executeUpdate("insert into PELICULAS (TITULO, DIRECTOR, GENERO, YEAR) values ('"+pelicula.getTitulo()+"','','',,)");
            PreparedStatement pst = cx.prepareStatement("SELECT FROM PELICULAS WHERE id=?");

            pst.setInt(1, id);

            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                pelicula = new Pelicula(rs.getInt("ID"), rs.getString("TITULO"), rs.getString("DIRECTOR"), rs.getString("GENERO"), rs.getInt("YEAR"));
            }
            return pelicula;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<Pelicula> obtenerPeliculas() {
        return List.of();
    }
}
