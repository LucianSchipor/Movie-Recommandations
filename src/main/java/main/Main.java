package main;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.io.File;
import java.io.IOException;
import java.io.FileInputStream;

public class Main {
    public static void main(String[] args) {

        Map<Genre, List<Movie>> genreHashMap = new HashMap<>();
        Genre Fantasy = new Genre("Fantasy", genreHashMap);
        Genre Anime = new Genre("Anime", genreHashMap);

        Movie secondMovie = Movie.builder()
                .title("Avatar")
                .genre(Fantasy)
                .movieStudio("RAtata")
                .likes(100)
                .releaseDate("10/2/2030")
                .build();
        Movie thrd = Movie.builder()
                .genre(Fantasy)
                .title("Naruto")
                .movieStudio("Itachi")
                .likes(1032)
                .build();

        Movie forth = Movie.builder()
                .genre(Anime)
                .title("Hulk")
                .movieStudio("Marvel Studio")
                .likes(39039)
                .build();

        Movie fifth = Movie.builder()
                .genre(Anime)
                .title("Romina VTM")
                .movieStudio("Vidra Studios")
                .likes(1032913)
                .build();


        User A = User.builder()
                .forname("Lucian")
                .surname("Schipor")
                .build();

        Feed feed = new Feed(genreHashMap);
        feed.viewOriginalFeed();
    }
}

        /*TODO   -> DE FACUT PROGRAMUL SA CITEASCA DIN FISIER FILMELE, MOMENTAN POATE DOAR DIN CONSOLA (cand apeleaza .build
           se pune ca si genre)
         *       -> CREAT CLASA FEED, DUPA CARE USER CARE MOSTENESTE FEED
         *       -> MAKEADMIN -> DIN USER TREBUIE SA INSTANTIEZE UN ADMIN
         *        -> FEED ARE TOATE LISTELE CU GENURI, FILMELE FIIND AFISATE RANDOM         *
         *       -> Map<Genre, Pair<Priorities, List<Movies>>>
         * * */

