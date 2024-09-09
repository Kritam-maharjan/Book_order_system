import Modules.Book;
import Modules.Customer;
import Modules.Genre;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Genre g1 = new Genre("Fiction");
        Genre g2 = new Genre("Biography");

        Book book1 = new Book("The wisdom", "Mr. Jack Jean", g1, 599.67F);
        Book book2 = new Book("The Japenese Sword","Mrs. Luixin", g1,499.78F);
        Book book3 = new Book("Walt Disney","Mr. Disney JR.", g2, 999.90F);

        System.out.println("LOGIN HERE: ");
        System.out.println("Enter your id and username: ");
        Customer c1 = new Customer(input.nextInt(), input.nextLine());


        book1.getdetail();
        book2.getdetail();
        book3.getdetail();

        List<Books> onSale = new ArrayList<Books>();
        onSale.add(book1);
        onSale.add(book2);
        onSale.add(book3);
        List<BookOrder> bookOrderList = new ArrayList<>();

        System.out.println("Ready to order?");
        if (input.nextLine().equalsIgnoreCase("yes")) {
            System.out.println("Enter bookname");
            String bookname = input.nextLine();
            System.out.println("Enter quantity for the book");
            int quantity = input.nextInt();
        }
        else{
            System.out.println("Thank you for visiting our library!!!");
        }



    }
}