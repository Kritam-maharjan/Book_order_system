import models.BookOrder;
import models.Books;
import models.Genre;
import models.Order;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Genre genre1 = new Genre("Horror", "Best");
        Genre genre2 = new Genre("SiFi", "Mystery");
        Genre genre3 = new Genre("thriller", "boring");


        Books book1 = new Books("Dar", "Mr. Samme",genre1, "worst", 4050, true);
        Books book2 = new Books("The legpiece ", "Chicken",genre2, "best", 200, true);
        Books book3 = new Books("Heartses open", "Mrs. Edwinr",genre3, "good", 550, false);


        List<Books> onSale = new ArrayList<Books>();
        onSale.add(book1);
        onSale.add(book2);
        onSale.add(book3);
        List<BookOrder> bookOrderList = new ArrayList<>();

        System.out.println("Do you want to order books?" +
                "Write true or false");
        boolean b = sc.nextBoolean();

        if (b) {
            System.out.println("books on sale are: ");
            for (int i = 0; i < onSale.size(); i++) {
                Books book = onSale.get(i);
                System.out.println("No" + (i + 1) + " " + book.getName());
            }

            System.out.println("To get details press 1 else press 2");
            int i = sc.nextInt();
            if (i == 1) {
                book1.getBookDetails();
                System.out.println();
                System.out.println();
                System.out.println();
                book2.getBookDetails();
                System.out.println();
                System.out.println();
                book3.getBookDetails();
                System.out.println();
                System.out.println();

            } else {
                System.out.println();
            }


            boolean ordering = true;
            while (ordering) {
                System.out.println("Which Book do you want to order press it's number");
                int which_book = sc.nextInt();
                System.out.println("How many do you want to order?");
                int how_many = sc.nextInt();
                if (which_book == 1) {
                    BookOrder bo1 = new BookOrder(1, book1, how_many);
                    bookOrderList.add(bo1);
                } else if (which_book == 2) {
                    BookOrder bo2 = new BookOrder(2, book2, how_many);
                    bookOrderList.add(bo2);
                } else if (which_book == 3) {
                    BookOrder bo3 = new BookOrder(3, book3, how_many);
                    bookOrderList.add(bo3);
                } else {
                    System.out.println("Press number between 1 to 3");
                }

                System.out.println("Do you want other books?(True or False)");
                boolean morebook = sc.nextBoolean();
                if (!morebook) {
                    ordering = false;
                }


            }
            Order order = new Order(bookOrderList,1 );
            int totalAmount = order.calculateTotalAmount();
            System.out.println("Total amount for your order: " + totalAmount);
        }
        else{
            System.out.println("No books were ordered");
        }
    }
}