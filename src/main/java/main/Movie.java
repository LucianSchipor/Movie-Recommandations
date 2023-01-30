package main;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.experimental.SuperBuilder;
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

    @Builder
    private Movie(String title,Genre genre, Integer likes, String movieStudio, Map<Genre, List<Movie>> genreHashMap){
        super(genre.genreTitle, genreHashMap);
        this.genreTitle = genre.genreTitle;
        this.title = title;
        this.likes = likes;
        this.movieStudio = movieStudio;
        genreHashMap.get(genre).add(this);
    }

    void viewMovieDetails(){
    System.out.println("Title: " + this.title + " || from Studio: " + this.movieStudio + " || Genre: " + this.genreTitle + " || with: " + this.likes + " likes.");
    }


}
