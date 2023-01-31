package main;

import java.util.*;

public class Main
{
    public static void main( String[] args ) {

        Map<Genre, List<Movie>> genreHashMap = new HashMap<Genre, List<Movie>>();
        Genre Fantasy = new Genre("Fantasy", genreHashMap);
        Genre Anime = new Genre("Anime", genreHashMap);

        Movie movie = Movie.builder()
                .genre(Fantasy)
                .title("Avengers")
                .movieStudio("Marvel")
                .likes(233)
                .build();  //AICI APARE PROBLEMA, CAND PASEZ MAPA, E NULL

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

        Fantasy.viewGenresList(genreHashMap);
        Anime.viewGenresList(genreHashMap);

        Movie forth = Movie.builder()
                .title("Hulk")
                .genre(Fantasy)
                .movieStudio("Marvel Studio")
                .likes(39039)

                .build();

        User a = User.builder()
                .forname("Lucian")
                .surname("Schipor")
                .build();

        a.addMovie(forth, genreHashMap);




        /*TODO -> DE FACUT PROGRAMUL SA CITEASCA DIN FISIER FILMELE, MOMENTAN POATE DOAR DIN CONSOLA
        *       -> CREAT CLASA FEED, DUPA CARE USER CARE MOSTENESTE FEED
        *       ->DE CREEAT CUMVA MAPA CU TOATE FILMELE
        *       -> FEED ARE TOATE LISTELE CU GENURI, FILMELE FIIND AFISATE RANDOM
        *       -> DE MODIFICAT PT CLASA GENRE, DIN LISTA IN MAPA
        *       ->INHERITANCE CU MAPA INTRE GENRE SI MOVIE
        * */

    }
}
