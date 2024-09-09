import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double itemPrice =0, sum = 0, totalamtVat = 0, totalDiscAmt = 0;
        int  userID, Pass;
        System.out.println("Enter your user ID: ");
        userID = input.nextInt();
        System.out.println("Enter your password: ");
        Pass = input.nextInt();

        ArrayList<Double> itempriceList = new ArrayList<Double>();
        System.out.println("Enter the item price you purchased");
        System.out.println("Provide 0 if you want to exit!!");

        while(true){
            itemPrice = input.nextFloat();

            if(itemPrice ==0){
                break;
            }

            itempriceList.add(itemPrice) ;
        }

        for ( double price : itempriceList) {
            sum += price;
        }

        System.out.println("Sum = " + sum);
        System.out.println("Do you want to add VAT? (y/n)");
        String Vat = input.next();
        Vat = Vat.toLowerCase();

        if(Vat.equals("y")) {
            totalamtVat = sum + (0.13*sum);
            System.out.println("Your new price with VAT is: Rs "+ totalamtVat) ;
        }
        else {
            totalamtVat = sum;
            System.out.println("Your new price without VAT is: Rs " + totalamtVat);
        }



        System.out.println("Do you want Discount? (y/n)");
        String Dis = input.next();
        Dis = Dis.toLowerCase();

        if(Dis.equals("y")){
            System.out.println("How much discount pecentage do you want? " +
                    "***Applicale only below 50%***");
            double discper = input.nextDouble();
            if(discper<50){
                totalDiscAmt = totalamtVat - ((discper/100)*totalamtVat);
            }
        }
        else{
            totalDiscAmt = totalamtVat;
        }

        System.out.println("Your total amount is "+totalDiscAmt);

        System.out.println("How would you like to pay?");
        double cashed = input.nextDouble();

        if(cashed<totalDiscAmt){
            System.out.println("Your total amount is "+totalDiscAmt+". Insuffiecient amount.");
        }

        else if(cashed==totalDiscAmt){
            System.out.println("Thank you, visit again!!");
        }

        else if(cashed>totalDiscAmt){
            int note = (int)cashed- (int)totalDiscAmt;

            if (note >=1000){
            int times = note / 1000;
            System.out.println("1000 *"+(int)times);
            note = note-(1000*times);
            }


            if (note >= 500) {
            int times = note / 500;
            System.out.println("500 *"+(int)times);
            note = note-(500*times);
            }

            if (note >= 100) {
            int times = note / 100;
            System.out.println("100 *"+(int)times);
            note = note-(100*times);
            }

            if (note >= 50) {
            int times = note / 50;
            System.out.println("50 *"+(int)times);
            note = note-(50*times);
            }

            if (note >= 20) {
            int times = note / 20;
            System.out.println("20 *"+(int)times);
            note = note-(20*times);
            }

            if (note >= 10) {
            int times = note / 10;
            System.out.println("10 *"+(int)times);
            note = note-(10*times);
            }

            if (note >= 5) {
            int times = note / 5;
            System.out.println("5 *"+(int)times);
            note = note-(5*times);
            }

            if(note>=1){
                int times = note/1;
                System.out.println("1 *"+(int)times);
                note = note-(1*times);
            }
        }

        System.out.println("Thank you, visit again!!");
    }
}

