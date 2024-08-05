import java.util.Scanner;
public class Learning1 {



        public static void main(String[] args) {
//       // float pi = 3.1465F;
//        //long phone = 9843179103L;
//        //int phone2 = 984133836;
//        //byte num = -128;//primitive data type
//
//        String name = "Radeonite";//non primitive data type
//        //System.out.println(name.length());
//        //System.out.println(name.substring(0,6));
//
//        int[] num1 = new int[3];
//        num1[0]= 10;
//        num1[1]=100;
//        num1[2]=20;
//
//        //System.out.println(num1[2]);
//       // System.out.println(num1.length);
////        Arrays.sort(num1);
////        System.out.println(num1[1]);
////        double price = 100;
////        double finalprice = price + 18;
////        System.out.println(finalprice);
////
////        int p = 100;
////        int fp = p + (int)18.18;
////        System.out.println(fp);
//
//        final float pi = 3.14F;//final le constant banaidincha
//        //pi = 3.1465F;
//
//        Scanner input =  new Scanner(System.in);
//        System.out.println("Enter your double age ");
//        int age1 = input.nextInt();
//        int age2 = input.nextInt();
//        if(age1>age2){
//            System.out.println("First person is older");
//        }
//        else if(age1>age2 || age1==age2){
//            System.out.println("You both are same");
//        }
//        else{
//            System.out.println("Second is older");
//        }
//    Scanner input = new Scanner(System.in);
//        System.out.println("Enter the aount you have ");
//        int amt = input.nextInt();
//        //pen=10 book =50
//        if(amt==50){
//            System.out.println("You can buy a book");
//        }
//        else if(amt>50 && amt <60){
//            System.out.println("You can still buy book only");
//        }
//        else if(amt>10 && amt<50){
//            System.out.println("Pen matra pauchas");
//        }
//        else if(amt<10){
//            System.out.println("You can not buy a pen, garib!!");
//        }
//        else if(amt >10 && amt>60){
//            System.out.println("Buy a pen and a book, richkid!");
//        }

            //DO-While
//        Scanner input = new Scanner(System.in);
//
//        System.out.println("Enter a number");
//        int num = input.nextInt();
//        do{
//            System.out.println("Enter another number");
//            num = input.nextInt();
//            System.out.println(num);
//        }while(num>=0);
//        System.out.println("THE END");

//        Func();
            Scanner inpout = new Scanner(System.in);
            int num = inpout.nextInt();
            Multiple(num);


        }
        //    public static void Func() {
//        System.out.println("This is a function");
//    }
        public static void Multiple(int num){
            System.out.println(num*num);
        }
    }
