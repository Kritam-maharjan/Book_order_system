import Models.Daughter;
import Models.G_parent;
import Models.Parent;
import Models.Son;

public class Main {
    public static void main(String[] args) {
        Parent p1 = new Parent("Maharjan","Chhauni", 1234,true);
//        Son s1 = new Son();
//        Daughter d1 = new Daughter();

//        System.out.println("My name is "+ s1.name +" " + s1.caste + ". I live in " + s1.house);
//        System.out.println(s1.caste);
//        System.out.println(s1.house);
//        System.out.println(s1.name);

        System.out.println(p1.caste);

        Son s1 = new Son("Maharjan", "Chhauni", 1234, true,"Kritam");
        System.out.println(s1.name);
        System.out.println(s1.caste);

        Daughter d1 = new Daughter("Dahal","Chhauni", 3455, false, "K");

        System.out.println(d1.name);
        System.out.println(d1.caste);
    }
}