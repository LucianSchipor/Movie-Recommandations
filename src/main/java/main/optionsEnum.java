package main;

public enum optionsEnum {
OPTION_1("OPTION 1: View your feed."),
    OPTION_2("OPTION 2: Search for a movie."),
    OPTION_3("OPTION 3: View a genre"),
    OPTION_4("OPTION 4: Add a movie.");

    private String value;
    optionsEnum(String value){

        this.value = value;
    }


    public String getValue() {
        return value;
    }
}
