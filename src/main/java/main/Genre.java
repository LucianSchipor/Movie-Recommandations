package main;
import lombok.*;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;


 public class Genre {
    protected String genreTitle;


    public Genre(String genreTitle, Map<Genre, List<Movie>> genreHashMap) {
        //Contructor beacuse this isn't the builder class
        this.genreTitle = genreTitle;
        genreHashMap.computeIfAbsent(this, k -> new ArrayList<Movie>());
    }

    public void viewGenresList(Map<Genre, List<Movie>> genreHashMap) {
        //View all movies from a genre
        System.out.println("All " + this.genreTitle + " movies: ");
        System.out.println();
        for(Map.Entry<Genre, List<Movie>> entry : genreHashMap.entrySet()) {
            entry.getValue().forEach(Movie::viewMovieDetails);
        }
    }
}
