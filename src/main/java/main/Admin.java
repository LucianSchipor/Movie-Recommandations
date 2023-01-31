package main;

import java.util.List;
import java.util.Map;

public class Admin {

    public void addMovie(Movie movie, Map<Genre, List<Movie>> genreHashMap) {
        genreHashMap.get(movie.getMovieGenre()).add(movie);

        try {
            System.out.println("Movie ");
            movie.viewMovieDetails();
            System.out.println(" has been added succesfuly.");
            System.out.println();
        }
        catch(NullPointerException e){
            System.out.println("ERROR");
            e.printStackTrace();
        }
    }s
}
