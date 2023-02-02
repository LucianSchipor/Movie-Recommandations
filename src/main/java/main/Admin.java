package main;

import lombok.Builder;

import java.util.List;
import java.util.Map;

public class Admin extends User{

    public Admin(String surname, String forname)
    {
        super(surname, forname);
    }

//    public Admin(User user){
//        super(user.isAdmin);
//        user.isAdmin = true;
//    }

}
