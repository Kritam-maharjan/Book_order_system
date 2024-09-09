package models;

import java.util.List;

public class Customer {
    String username;
    String Email;
    private List<Order> Orders;

    public Customer(String username, String email, List<Order> orders) {
        username = username;
        Email = email;
        Orders = orders;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        username = username;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public List<Order> getOrders() {
        return Orders;
    }

    public void setOrders(List<Order> orders) {
        Orders = orders;
    }

    public void customersinfo(){
        System.out.println("Customer Name: " + username);
        System.out.println("Email: " + Email);
        System.out.println("Orders: " + Orders);
    }

    public void printAllOrders() {
        System.out.println("Orders for Customer: " + username);
        for (Order order : Orders) {
            System.out.println("Order ID: " + order.getOrderID());
            for (BookOrder bookOrder : order.getBookOrders()) {
                Books book = bookOrder.getBook();
                System.out.println("  Book: " + book.getName() +
                        ", Quantity: " + bookOrder.getQuantity() +
                        ", Price per unit: " + book.getPrice());
            }


        }

    }
}
