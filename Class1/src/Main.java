import Modules.Bike;
import Modules.Mammals;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello World");
//
//        int num1, num2;
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter two numbers");
//        num1 = input.nextInt();
//        num2 = input.nextInt();
//        int  num3 = num1 + num2;
//        System.out.println("The sum of the number is "+num3);
//
//        int prin, rate, time;
//        System.out.println("Enter principle, rate and time");
//        prin = input.nextInt();
//        rate = input.nextInt();
//        time = input.nextInt();
//        int SI = (prin*time*rate)/100;
//        System.out.println("The Simple Interest on the amount is "+SI);
//
//
//        int length, breadth;
//        System.out.println("Enter length and breadth");
//        length = input.nextInt();
//        breadth = input.nextInt();
//        int Area = length*breadth;
//        System.out.println("The area is "+Area);

        Bike bike1 = new Bike();
        bike1.strat();
        bike1.stop();

        Mammals m1 = new Mammals("dog");
        Mammals m2 = new Mammals("cow");

        System.out.println(m1.spicies);
        System.out.println(m1.Chamber);
        System.out.println(m2.spicies);
        System.out.println(m2.Chamber);

        m1.Greeting();
        m2.Greeting();
        }
    }