package main;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Admin extends User{
    private Map<Genre, List<Movie>> userMap;
    Boolean isAdmin;

    public Admin(String surname, String forname, Map<Genre, List<Movie>> userMap) {
        super(surname, forname, userMap);
        this.isAdmin = true;
        this.userMap = userMap;

    }


}
