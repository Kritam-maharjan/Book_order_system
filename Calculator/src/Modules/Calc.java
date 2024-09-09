package Modules;

import java.util.ArrayList;
import java.util.Scanner;

public class Calc {
    ArrayList<Float> numers = new ArrayList<Float>();
    System.out.println("**Note: Enter 0 if you want to get the sum");

    while(True){
        Float num = input.nextFloat();
        if(num == 0){
            break;
        }
        else
            numers.add(num);
    }

    public class Add {

        Scanner input = new Scanner(System.in);

    System.out.println("Enter the numbers you want to add: ");
    System.out.println("**Note: Enter 0 if you want to get the sum")
            while(True){
            Float num = input.nextFloat();
            if(num == 0){
                break;
            }
            else
                numers.add(num);
            }

        public void add(){
            System.out.println(2+2);
        }
        public void stop(){
            System.out.println("Your bike is stopped!!");
        }
    }

}

}
