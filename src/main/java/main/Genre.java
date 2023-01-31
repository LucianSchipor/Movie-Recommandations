package main;
import lombok.*;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;


 public class Genre {
    protected String genreTitle;

     Map<Genre, List<Movie>> genreHashMap;
    public Genre(String genreTitle, Map<Genre, List<Movie>> genreHashMap) {
        //Contructor beacuse this isn't the builder class
        this.genreTitle = genreTitle;
        genreHashMap.put(this, new ArrayList<>());
        this.genreHashMap = genreHashMap;
    }

    public void viewGenresList(Map<Genre, List<Movie>> genreHashMap) {


            System.out.println(this.genreTitle + " movies are: ");
            genreHashMap.get(this).forEach(Movie::viewMovieDetails);
            System.out.println();
        }

     public String getGenreTitle() {
         return genreTitle;
     }

     public Map<Genre, List<Movie>> getGenreHashMap() {
         return this.genreHashMap;
     }

 }
