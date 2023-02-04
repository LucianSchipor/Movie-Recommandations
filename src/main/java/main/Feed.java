package main;
import lombok.Builder;
import main.Movie;
import main.Genre;
import java.util.List;
import java.util.Map;

public class Feed {

    Map<Genre, List<Movie>> feedMap;

    @Builder
    Feed(Map<Genre, List<Movie>> feedMap){
        this.feedMap = feedMap;
    }

    public void viewOriginalFeed(){
        System.out.println("Film  ||  Categorie  || Studio ||  Release Date  ||  Aprecieri"); //DEBUG
        System.out.println();
        for(Map.Entry<Genre, List<Movie>> entry : feedMap.entrySet()){
            entry.getKey().viewGenreList(feedMap);
        }
    }

//    public void addMovieToFeed(Genre genre, String title, String movieStudio, Integer likes){
//        Movie movie = Movie.builder()
//                .genre(genre)
//                .title(title)
//                .movieStudio(movieStudio)
//                .likes(likes)
//                .build();
//    }

}
