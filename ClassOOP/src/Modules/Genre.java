package Modules;

public class Genre {
    String name, description;

    public Genre(String name, String description) {
        //Initialize the variables
        this.name = name;
        this.description = description;
    }

    public String getName() {
        //Get the name of the book
        return name;
    }

    public void setName(String name) {
        //To change the name
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
