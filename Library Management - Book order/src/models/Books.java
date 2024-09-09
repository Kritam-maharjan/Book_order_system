package models;


import java.util.List;

public class Books {

    String name;
    String author;
    Genre genre;
    String description;
    int price;

    public Books(String name, String author, Genre genre, String description, int price, boolean indiscount) {
        this.name = name;
        this.author = author;
        this.genre = genre;
        this.description = description;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void settitle(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }


    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public List<Books> getBookDetails() {
        System.out.println("name of book: " + this.name + "written by author: " + this.author);
        System.out.println("genre of book: " + this.genre + "Description of book is " + this.description);
        System.out.println("price of book: " + this.price + "rs");

        return null;
    }

}