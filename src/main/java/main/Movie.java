package main;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.experimental.SuperBuilder;
import java.util.List;

public class Movie extends Genre {
    private String title;
    private Integer likes;
    private String movieStudio;
    private String genreTitle;

    @Builder
    private Movie(String title, Genre genre, Integer likes, String movieStudio){
        super(genre.genreTitle);
        this.title = title;
        this.likes = likes;
        this.movieStudio = movieStudio;
        genre.addMovie(this, true);
    }

    void viewMovieDetails(){
    System.out.println(this.title + " " + this.genreTitle + " " + this.likes + " " + this.movieStudio);
    }

}
