package Modules;

public class Book {
    String bookname, author;
    Genre genre;
    float price;

    public Book(String bookname, String author, Genre genre, Float price) {
        this.bookname = bookname;
        this.author = author;
        this.genre = genre;
        this.price = price;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
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

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public void getdetail() {
        System.out.println("Book Name: " + bookname);
        System.out.println("Author: " + author);
        System.out.println("Genre: " + genre);
        System.out.println("Price: " + price);

    }
}
