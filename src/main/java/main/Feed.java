package main;
import lombok.Builder;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;


//TODO -> adaug un camp priority in genre
public class Feed {
    Map<Genre, List<Movie>> feedMap;
    public Map<Genre, Integer> prioritiesMap;

    //SORTEZ PRIORITIES MAP, CA DUPA PE BAZA LUI SA SORTEZ FEED-ul.
    @Builder
    Feed(User user) {
        this.feedMap = user.userMap;
        this.prioritiesMap = user.prioritiesMap;
    }

    public void viewFeed() {
        Stream<Map.Entry<Genre, Integer>> sorted;
        System.out.println();
        for (Map.Entry<Genre, List<Movie>> entry : feedMap.entrySet()) {
            entry.getKey().viewGenreList(feedMap);
        }
    }
    public void viewSpecificFeed() {
        if(prioritiesMap.isEmpty()) {
            feedMap.entrySet().stream().toList().forEach(n -> n.getValue().forEach(el -> el.viewMovieDetails()));
        }
        else {
            List<Genre> genreByPriority = new ArrayList<>(prioritiesMap.keySet());
            genreByPriority.forEach(n -> n.setPriority(prioritiesMap.get(n.getGenre())));

            Comparator<Genre> genreComparator = Comparator.comparing(Genre::getPriority).reversed();
//      genreByPriority.stream().sorted(genreComparator).toList().forEach(n -> System.out.println(n.getGenreTitle() + " " + n.getPriority())); //DEBUG

            genreByPriority.stream().sorted(genreComparator).forEach(n ->
                    n.viewGenreList(feedMap)); //DEBUG
        }

    }




}


