import Modules.Book;
import Modules.Genre;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        Genre g1 = new Genre("Fiction", "Better");
        Genre g2 = new Genre("Biography", "good");

//        System.out.println(g1.getName());
//        System.out.println(g1.getDescription());
//
//        g1.setName("Comedy");
//        System.out.println(g1.getName());

        Book book1 = new Book("The wisdom", "Mr. Jack Jean", g1, "Simple Story", 599.67,true );
        book1.getDetail();
    }
}