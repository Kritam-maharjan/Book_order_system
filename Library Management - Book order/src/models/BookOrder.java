package models;

public class BookOrder {
    private int bID;
    private Books book;
    private int quantity;

    public BookOrder(int bID, Books book, int quantity) {
        this.bID = bID;
        this.book = book;
        this.quantity = quantity;
    }

    public int getBookID() {
        return bID;
    }

    public void setBookID(int bookID) {
        this.bID = bID;
    }

    public Books getBook() {
        return book;
    }


    public void setBook(Books book) {
        this.book = book;
    }



    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int calculateTotalPrice() {
        return this.book.getPrice() * this.quantity;
    }
}
