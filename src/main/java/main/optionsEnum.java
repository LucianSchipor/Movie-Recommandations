package main;

public enum optionsEnum {
OPTION_1("OPTION 1: View your feed."),
    OPTION_2("OPTION 2: Search for a movie."),
    OPTION_3("OPTION 3: Like a movie"),
    OPTION_4("OPTION 4: Add a movie."),
    OPTION_5("Add movies to file"),

    OPTION_0("OPTION 0: Exit.");


    private String value;
    optionsEnum(String value){

        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
