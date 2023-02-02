package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Scanner;

public class UserMenu {
    //DO NOT HAVE ACCES TO UPDATE MOVIE DATABASE
    //HE ONLY CAN VIEW FEED, LIKE MOVIES
    List<optionsEnum> optionsList = List.of(optionsEnum.values());
    int choice;

    private Map<Genre, List<Movie>> genreHashMap;

    public UserMenu(Map<Genre, List<Movie>> genreHashMap){
        choice = -1;
        System.out.println("Your options are: ");
        optionsList.forEach(optionsEnum -> System.out.println(optionsEnum.getValue()));
        System.out.println();
        System.out.println("Choose your option: ");
        this.genreHashMap = genreHashMap;
    }

public void viewMenu() {
    Scanner scanner = new Scanner(System.in);
    if (scanner.hasNextInt())
        choice = scanner.nextInt();

    switch (choice) {
        case 0:
            System.out.println("You succesfully terminated application.");
            return;
        case 1:
            System.out.println(optionsEnum.OPTION_1.getValue());
            //SOMETHING
            viewMenu();
            break;
        case 2:
            System.out.println("Enter the movie name: ");
            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(System.in)
            );

            try {
                String name = reader.readLine();
            }
            catch (IOException e){
                System.out.println("ERROR");
                e.printStackTrace();

            }

            for(Map.Entry<Genre, List<Movie>> entry : genreHashMap.entrySet()){
                entry.getValue().forEach((n) -> {
                    if(n.getTitle().equals(reader)){
                    n.viewMovieDetails();
                    return;
                    }});
            }

            viewMenu();
            break;
        case 3:
            System.out.println(optionsEnum.OPTION_3.getValue());
            viewMenu();
            break;
        default:
            System.out.println("ERROR: Option number " + choice + " dosen't exist.");
    }
}
}
