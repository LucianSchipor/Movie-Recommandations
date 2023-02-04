package main;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
import java.util.stream.Stream;


public class Main {

    public static Genre genreWithThisTitle(String genreName, Map<Genre, List<Movie>> newMap){
        for(Map.Entry<Genre, List<Movie>> entry : newMap.entrySet()){
            if(entry.getKey().getGenreTitle().equals(genreName))
                return entry.getKey();
        }
        return null;
    }

    public static  Map<Genre, List<Movie>> readTheFileAndStore(File file) {
        /*TODO -> ar trebui sa-mi returneze o mapa de variabile.
        *       -> ar trebui sa vad daca mapa e null, si daca nu e adaug pe cheia Genre filmul.
        * */
        Map<Genre, List<Movie>> newMap = new HashMap<>();
        try {
            Files.lines(file.toPath())
                    .map(l -> l.split(" "))
                    .forEach(element -> {
                        List<String> a = Arrays.stream(element).toList();

                        if(genreWithThisTitle(a.get(1), newMap) == null)
                            newMap.put(new Genre(a.get(1)), new ArrayList<Movie>());

                        newMap.get(genreWithThisTitle(a.get(1), newMap)).add(Movie.builder()
                                .title(a.get(0))
                                .genre(genreWithThisTitle(a.get(1), newMap))
                                .movieStudio(a.get(2))
                                .releaseDate(a.get(3))
                                .build());
                    });
        }
        catch (IOException e) {
            System.out.println("ERROR");
            e.printStackTrace();
        }
    return newMap;
    }

    public static void main(String[] args) {

        File moviesFile = new File("src/main/resources/Movies.txt");
        Map<Genre, List<Movie>> newMap = new HashMap<>();
        File feedFile = new File("src/main/resources/Feed.txt");

        newMap = readTheFileAndStore(moviesFile);

        Feed feed = new Feed(newMap);
        feed.viewOriginalFeed();

        User a = new User("Lucian", "Schipor");

        Movie movie = Movie.builder()
                .title("Avengers")
                .genre(new Genre("Fantasy"))
                .likes("102")
                .build();

        UserMenu menu = new UserMenu(newMap);
        menu.viewMenu();
    }
}


        /*TODO
         * -> CITIRE:
         *          -> De modificat constructorul genre.
         * -> FEED:
         *      -> DE GANDIT CUM SA SE FACA PRIORITATEA GENURILOR (FILMELE SUNT AFISATE IN ORDINE DE LIKES)
         *      -> MAKEADMIN -> DIN USER TREBUIE SA INSTANTIEZE UN ADMIN
         *      -> FEED ARE TOATE LISTELE CU GENURI, FILMELE FIIND AFISATE RANDOM
         * -> USER:
         *      -> CAND DAU LIKE LA UN FILM, ADAUG UNDEVA LA CE GEN DE FILM A DAT LIKE SI II CRESC PRIORITATEA
         */

