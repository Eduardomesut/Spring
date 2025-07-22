package org.model.sercices;


import org.model.entity.Movie;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Vector;

@Service
public class MovieService {
    private static List<Movie> movies;

    static {
        movies = new Vector<>();
        movies.add(new Movie(1L, "Avatar", "SCIFI", "James Cameron", "ewe", 2010, "James"));


    }


}
