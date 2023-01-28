package main;

/**
 * Hello world!
 *
 */
public class main
{
    public static void main( String[] args )
    {


        Genre Fantasy = Genre.builder()
                .genreTitle("Fantasy")
                .build();

        Movie movie = Movie.builder()
                .movieStudio("Marvel")
                .likes(300)
                .genre(Fantasy)
                .build();
    }
}
