package main;

import lombok.Builder;

@Builder
public class Movie extends Genre{

    private String releaseDate;
    protected Integer likes;
    protected Genre genre;
    public String title;
    public String movieStudio;

void viewMovieDetails(){
    System.out.println(title + " " + genreTitle + " " + likes + " " + movieStudio);
}

}
