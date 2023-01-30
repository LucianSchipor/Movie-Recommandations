package main;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main
{
    public static void main( String[] args )
    {

        List<Movie> movieList;
        Genre genre = new Genre("Fantasy");

        Movie movie = Movie.builder()
                .genre(genre)
                .title("Avengers")
                .movieStudio("Marvel")
                .build();

        Movie secondMovie = Movie.builder()
                .title("Avatar")
                .movieStudio("RAtata")
                .likes(100)
                .genre(genre)
                .build();


    movie.viewMovieDetails();
    secondMovie.viewMovieDetails();
    genre.viewGenresList();

        File fis = new File("C:/Developing/Java/MovieRecommandation/src/main/resources/Movies.xlsx");
        try{
            FileOutputStream outputStream = new FileOutputStream(fis);
            String data = "This is a line of text";
            byte[] dataBytes = data.getBytes();
            outputStream.write(dataBytes);
            outputStream.close();

        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
}
