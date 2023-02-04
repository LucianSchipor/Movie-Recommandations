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

    private String releaseDate;

    public String getReleaseDate() {
        return releaseDate;
    }

    private Integer likes;
    private String movieStudio;
    private String genreTitle;
    private Genre genre;

    @Builder
    public Movie(String title, Genre genre, Integer likes, String movieStudio, String releaseDate){
        this.genreHashMap = genre.getGenreHashMap();

        this.genreTitle = genre.genreTitle;
        this.title = title;
        this.likes = likes;
        this.movieStudio = movieStudio;
        this.genre = genre;
        this.releaseDate = releaseDate;

        genreHashMap.get(this.genre).add(this);
    }

    void viewMovieDetails(){
    System.out.println(this.title + " || "  + this.genreTitle + " || " + this.movieStudio + " || " + " || " + this.releaseDate + " || " + this.likes );
    }

    public Genre getMovieGenre(){
        return this.genre;
    }

    protected void increaseLikes(){
        this.likes++;
    }

}
