package main;

import java.util.*;


public class Genre{
    protected String genreTitle;
    private Integer priority = 0;

    public Genre() {
    }

    public Integer getPriority() {
        return priority;
    }

    public Genre(String genreTitle) {
        //Contructor beacuse this isn't the builder class
        this.genreTitle = genreTitle;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }
    public void viewGenreList(Map<Genre, List<Movie>> genreHashMap) {

            genreHashMap.get(this).forEach(Movie::viewMovieDetails);
        }

     public String getGenreTitle() {
         return genreTitle;
     }

    public Genre getGenre(){
        return this;
    }
 }
