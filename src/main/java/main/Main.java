package main;

import java.io.*;
import java.nio.file.Files;
import java.util.*;

public class Main {

    public static Genre genreWithThisTitle(String genreName, Map<Genre, List<Movie>> newMap){
        for(Map.Entry<Genre, List<Movie>> entry : newMap.entrySet()){
            if(entry.getKey().getGenreTitle().equals(genreName))
                return entry.getKey();
        }
        return null;
    }

    public static  Map<Genre, List<Movie>> readTheFileAndStore(File file) {
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
                                .likes(a.get(4))
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
        newMap = readTheFileAndStore(moviesFile);

        User a = new User("Lucian", "Schipor", newMap);
        a.viewUserMenu();
    }
}

/*
*TODO:- modul in care este sortat feed-ul.
*   -administrator
* */
