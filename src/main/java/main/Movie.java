package main;

import lombok.Builder;

import java.io.ObjectOutputStream;
import java.io.PrintWriter;

public class Movie extends Genre {
    private String title;

    public String getTitle() {
        return title;
    }

    public String getLikes() {
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

    private String likes;
    private String movieStudio;
    private String genreTitle;
    private Genre genre;

    @Builder
    public Movie(String title, Genre genre, String likes, String movieStudio, String releaseDate){
        this.genreTitle = genre.genreTitle;
        this.title = title;
        this.likes = likes;
        this.movieStudio = movieStudio;
        this.genre = genre;
        this.releaseDate = releaseDate;
    }

    void viewMovieDetails(){
        System.out.println(this.title + " || "  + this.genreTitle + " || " + this.movieStudio + " || " + this.releaseDate + " || " + this.likes );
    }

    void outMovieDetails(ObjectOutputStream file){
        PrintWriter out = new PrintWriter(file);
        out.println(this.title + " || "  + this.genreTitle + " || " + this.movieStudio + " || " + this.releaseDate + " || " + this.likes );
    }

    public Genre getMovieGenre(){
        return this.genre;
    }

    protected void increaseLikes(){
        this.likes = String.valueOf(Integer.valueOf(this.likes)+1);
    }

}
