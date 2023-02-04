package main;

import java.util.*;


public class Genre {
    protected String genreTitle;

    public Genre(String genreTitle) {
        //Contructor beacuse this isn't the builder class
        this.genreTitle = genreTitle;
    }

    public Genre() {
    }

    public void viewGenreList(Map<Genre, List<Movie>> genreHashMap) {

            genreHashMap.get(this).forEach(Movie::viewMovieDetails);
        }

     public String getGenreTitle() {
         return genreTitle;
     }


 }
