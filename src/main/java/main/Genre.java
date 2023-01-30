package main;
import lombok.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


@AllArgsConstructor
 public class Genre {
    protected String genreTitle;
    List<Movie> genresList = new ArrayList<>();

    public Genre(String genreTitle) {
        //Contructor beacuse this isn't the builder class
        this.genreTitle = genreTitle;
    }

    public void addMovie(Movie newMovie, Boolean isAdmin) {
        //Add one movie
        genresList.add(newMovie);
    }

    public void addMovie(List<Movie> newMovies, Boolean isAdmin) {
        //Add a list of movies if you want
        Stream<Movie> firstStream = genresList.stream();
        Stream<Movie> secondStream = newMovies.stream();

        List<Movie> newList = Stream.concat(firstStream, secondStream).collect(Collectors.toList());
        genresList = newList;
    }

    public void viewGenresList() {
        //View all movies from a genre
        System.out.println("All " + this.genreTitle + " movies: ");
        System.out.println();
        genresList.forEach(Movie::viewMovieDetails);
    }
}
