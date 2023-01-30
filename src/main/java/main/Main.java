package main;

import javax.swing.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main
{
    public static void main( String[] args ) {

        List<Movie> movieList;
        Genre Fantasy = new Genre("Fantasy");
        Genre Anime = new Genre("Anime");

        Movie movie = Movie.builder()
                .genre(Fantasy)
                .title("Avengers")
                .movieStudio("Marvel")
                .likes(233)
                .build();

        Movie secondMovie = Movie.builder()
                .title("Avatar")
                .movieStudio("RAtata")
                .likes(100)
                .genre(Fantasy)
                .build();
        Movie thrd = Movie.builder()
                .genre(Anime)
                .title("Naruto")
                .movieStudio("Itachi")
                .likes(1032)
                .build();

        movie.viewMovieDetails();
        secondMovie.viewMovieDetails();
        System.out.println();
        Fantasy.viewGenresList();
        Anime.viewGenresList();
//
//        try(BufferedReader bufferdOutputStream = new BufferedReader(new FileReader(fis))){
//            String line;
//            while((line = bufferdOutputStream.readLine()) != null){
//                System.out.println(line);
//            }
//        }
//        catch(IOException e){
//            System.out.println("An error ocurred");
//        }

        /*TODO -> DE FACUT PROGRAMUL SA CITEASCA DIN FISIER, MOMENTAN POATE DOAR DIN CONSOLA
        *       -> CREAT CLASA FEED, DUPA CARE USER CARE MOSTENESTE FEED
        *       -> FEED ARE TOATE LISTELE CU GENURI, FILMELE FIIND AFISATE RANDOM
        * */

    }
}
