package main;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class UserMenu {
    List<optionsEnum> optionsList = List.of(optionsEnum.values());
    int choice;
    private Map<Genre, List<Movie>> moviesMap;
    User currentlyUser;

    protected UserMenu(User currentlyUser, Map<Genre, List<Movie>> moviesMap){
        System.out.println();
        choice = -1;
        System.out.println("Your options are: ");
        optionsList.forEach(optionsEnum -> System.out.println(optionsEnum.getValue()));
        System.out.println();
        this.moviesMap = moviesMap;
        this.currentlyUser = currentlyUser;
    }

protected void viewMenu() {
    System.out.println("Choose your option: ");
    Scanner scanner = new Scanner(System.in);
do{
    if (scanner.hasNextInt())
        choice = scanner.nextInt();

    switch (choice) {
        case 0: {
            System.out.println("You succesfully executed application.");
            return;
        }
        case 1: {
            System.out.println(optionsEnum.OPTION_1.getValue());
            currentlyUser.viewUserFeed();
            break;
        }

        case 2: {
            System.out.println(optionsEnum.OPTION_2.getValue());
            System.out.println("Enter the movie name: ");

            Scanner stringScanner = new Scanner(System.in);
            String name = stringScanner.nextLine();
            currentlyUser.searchMovie(name, currentlyUser.userMap).viewMovieDetails();
            break;
        }

        case 3: {
            System.out.println(optionsEnum.OPTION_3.getValue());
            Scanner movieScanner = new Scanner(System.in);

            System.out.println("Choose wich movie do you want to like: ");
            String movieName = movieScanner.nextLine();
            currentlyUser.likeMovie(movieName, currentlyUser.userMap);
            System.out.println("You liked: " + movieName);
            break;
        }

        case 4: {
            System.out.println(optionsEnum.OPTION_5.getValue());
            if (currentlyUser.isAdmin == false) {
                System.out.println("ERROR: You are not an admin.");
                System.out.println("Do you want to make" + currentlyUser + " an admin? (y/n): ");
                Scanner adminScanner = new Scanner(System.in);
                String choice = adminScanner.nextLine();

                if (choice.equals("y")) {
                    currentlyUser.isAdmin = true;
                    System.out.println(currentlyUser + "is now admin.");
                } else
                    return;
            }
                currentlyUser.addMovies();

                        //try {
//                    PrintWriter out = new PrintWriter(new FileWriter("src/main/resources/Movies.txt"));
//                    out.write("Sunt smecher" + 5);
//                    out.close();
//
//                } catch (IOException e) {
//                    System.out.println("ERROR");
//                }
        }

        default: {
            System.out.println("ERROR: Option number " + choice + " dosen't exist.");
            System.out.println("Your options are: ");
            optionsList.forEach(optionsEnum -> System.out.println(optionsEnum.getValue()));
        }
    }
    System.out.println();
    System.out.println("Choose your option: ");

        }while (choice != 0);
    }
}
