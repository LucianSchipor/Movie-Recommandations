package main;

public enum OptionsEnum {
    OPTION_1("OPTION 1: View your feed."),
    OPTION_2("OPTION 2: Search for a movie."),
    OPTION_3("OPTION 3: Like a movie"),
    OPTION_4("OPTION 4: Add a movie."),
    OPTION_0("OPTION 0: Exit.");


    private String value;
    OptionsEnum(String value){

        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
