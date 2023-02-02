package main;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Genre, List<Movie>> genreHashMap = new HashMap<>();
        Genre Fantasy = new Genre("Fantasy", genreHashMap);
        Genre Anime = new Genre("Anime", genreHashMap);

        Movie movie = Movie.builder()
                .genre(Fantasy)
                .title("Avengers")
                .movieStudio("Marvel")
                .likes(233)
                .build();  //IL PUNE CA CHEIE

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

        Movie forth = Movie.builder()
                .title("Hulk")
                .genre(Fantasy)
                .movieStudio("Marvel Studio")
                .likes(39039)
                .build();

        Movie fifth = Movie.builder()
                .title("Romina VTM")
                .genre(Anime)
                .movieStudio("Vidra Studios")
                .likes(1032913)
                .build();


        User A = User.builder()
                .forname("Lucian")
                .surname("Schipor")
                .build();

       for(Map.Entry<Genre, List<Movie>> entry : genreHashMap.entrySet()){
           entry.getKey().viewGenresList(genreHashMap);
       }
    }
}

        /*TODO -> DE REZOLVAT MAPA, SE PUN 7 CHESTII
           -> DE FACUT PROGRAMUL SA CITEASCA DIN FISIER FILMELE, MOMENTAN POATE DOAR DIN CONSOLA (cand apeleaza .build
           se pune ca si genre)
         *       -> CREAT CLASA FEED, DUPA CARE USER CARE MOSTENESTE FEED
         *       -> MAKEADMIN -> DIN USER TREBUIE SA INSTANTIEZE UN ADMIN
         *        -> FEED ARE TOATE LISTELE CU GENURI, FILMELE FIIND AFISATE RANDOM         *
         *       -> Map<Genre, Pair<Priorities, List<Movies>>>
         * * */

