package main;
import lombok.Builder;
import main.Movie;
import main.Genre;
import java.util.List;
import java.util.Map;

public class Feed {

    Map<Genre, List<Movie>> genreHashMap;

    @Builder
    Feed(Map<Genre, List<Movie>> genreHashMap){
        this.genreHashMap = genreHashMap;
    }

    public void viewOriginalFeed(){
        System.out.println("Film  ||  Categorie  || Studio ||  Release Date  ||  Aprecieri"); //DEBUG
        for(Map.Entry<Genre, List<Movie>> entry : genreHashMap.entrySet()){
            entry.getKey().viewGenreList(genreHashMap);
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
