package main;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Movie extends Genre {
    private String title;

    public String getTitle() {
        return title;
    }

    public Integer getLikes() {
        return likes;
    }

    public String getMovieStudio() {
        return movieStudio;
    }

    public String getGenreTitle() {
        return genreTitle;
    }

    private Integer likes;
    private String movieStudio;
    private String genreTitle;
    private Genre genre;

    @Builder
    private Movie(String title,Genre genre, Integer likes, String movieStudio){
        super(genre.genreTitle, genre.getGenreHashMap());
        this.genreTitle = genre.genreTitle;
        this.title = title;
        this.likes = likes;
        this.movieStudio = movieStudio;
        this.genre = genre;
        genreHashMap.get(genre).add(this);

        //Pun in mapa o lista pe cheia x daca cheia nu exista.
        //Updatez lista daca lista exista
    }

    void viewMovieDetails(){
    System.out.println("Title: " + this.title + " || from Studio: " + this.movieStudio + " || Genre: " + this.genreTitle + " || with: " + this.likes + " likes.");
    }

    public Genre getMovieGenre(){
        return this.genre;
    }
}
