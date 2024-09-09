package Modules;

public class Book {
    String name, Author, description;
    Genre genre;
    Float price;
    Boolean Indiscount;

    public Book(String name, String author, Genre genre, String description, double price, Boolean indiscount) {
        this.name = name;
        this.Author = author;
        this.genre = genre;
        this.description = description;
        this.price = (float)price;
        Indiscount = indiscount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Boolean getIndiscount() {
        return Indiscount;
    }

    public void setIndiscount(Boolean indiscount) {
        Indiscount = indiscount;
    }

    public void getDetail(){
        System.out.println("Name: " + this.name);
        System.out.println("Author: " + this.Author);
        System.out.println("Gen: " + this.genre.name);
        System.out.println("Description: " + this.description);
        System.out.println("Price: " + this.price);
                System.out.println("Indiscount: " + this.Indiscount);
    }
}
