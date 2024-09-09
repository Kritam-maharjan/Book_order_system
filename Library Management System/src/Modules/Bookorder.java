package Modules;

public class Bookorder {
    Book bookName;
    int quantity;

    public Bookorder(Book bookName, int quantity) {
        this.bookName = bookName;
        this.quantity = quantity;
    }

    public Book getBookName() {
        return bookName;
    }

    public void setBookName(Book bookName) {
        this.bookName = bookName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
