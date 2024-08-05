import java.util.Scanner;

public class Ifcondition {
    public static void main(String[] args) {

//        int num1 = 70;
//        if(num1%2==0){
//            System.out.println("The number is even");
//        }
//        else{
//            System.out.println("The number is odd");
//        }
//
//        int age =50;
//        if(age >=18){
//            System.out.println("Can vote");
//        }
//        else{
//            System.out.println("Cannot vote");
//        }
//
//        int num = 15;
//        if( num % 3 == 0 && num % 5 == 0){
//            System.out.println("FizzBuzz");
//        }
//        else if(num % 3 == 0){
//            System.out.println("Fizz");
//        }
//        else if(num % 5 == 0){
//            System.out.println("Buzz");
//        }
//        else{
//            System.out.println(num);
//        }
//
//        Scanner input = new Scanner(System.in);
//        int money =input.nextInt();
//
//        if(money>=1000){
//            System.out.println("1000*1");
//            money = -1000;
//            if(money>=500){
//                System.out.println("500*1");
//            }
//        }

        int num = 50;
        Scanner input = new Scanner(System.in);

        System.out.println("Let's Begin!!");
        System.out.println("Guess a number");
        int guess= input.nextInt();

        while(true){
            if(guess == num){
                System.out.println("Right");
                break;
            }
            else if(guess < num){
                System.out.println("Your number is too low!");
                System.out.println("Try again");
                guess= input.nextInt();
            }
            else if(guess > num){
                System.out.println("Your number is too high!");
                System.out.println("Try again");
                guess= input.nextInt();
            }
        }
        System.out.println("You guessed it right!!");
    }
}
