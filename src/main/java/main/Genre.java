package main;

import com.sun.jdi.event.StepEvent;
import lombok.Builder;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Builder
public class Genre {

    protected List<Movie> genreMoviesList;
    protected String genreTitle;


    public void addMovie(Movie newMovie, Boolean isAdmin){
        genreMoviesList.add(newMovie);
    }

    public void addMovie(List<Movie>newMovies){
        Stream<Movie> firstStream = genreMoviesList.stream();
        Stream<Movie> secondStream = newMovies.stream();

        List<Movie> newList = Stream.concat(firstStream, secondStream).collect(Collectors.toList());
        genreMoviesList = newList;

    }

}
