package main;
import lombok.Builder;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;


//TODO -> adaug un camp priority in genre
public class Feed {

    Map<Genre, List<Movie>> feedMap;

    //SORTEZ PRIORITIES MAP, CA DUPA PE BAZA LUI SA SORTEZ FEED-ul.
    @Builder
    Feed(Map<Genre, List<Movie>> feedMap){
        this.feedMap = feedMap;
    }

    public void viewFeed(){
        Stream<Map.Entry<Genre,Integer>> sorted;
        System.out.println();
        for(Map.Entry<Genre, List<Movie>> entry : feedMap.entrySet()){
            entry.getKey().viewGenreList(feedMap);
        }
    }
}
