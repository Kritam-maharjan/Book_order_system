import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;

public class array {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
//            int arr[] = {1,2,3,4};
//            System.out.println(arr[0]);
//            System.out.println(arr[1]);
//            System.out.println(arr[2]);
//            System.out.println(arr[3]);
////          System.out.println(arr[4]);
//            System.out.println(arr);
//            System.out.println(Arrays.toString(arr));


//            System.out.println("Enter the size of the array: ");
//            int n = input.nextInt();
//            int[] arrUser = new int[n];
//
//            System.out.println("Enter the elements of the array: ");
//            for (int i = 0; i < n; i++) {
//                arrUser[i] = input.nextInt();
//            }
//
//            for (int i = 0; i < n; i++) {
//                System.out.println(arrUser[i]);
//            }
//            System.out.println(Arrays.toString(arrUser));


        ArrayList<Integer> myarrl = new ArrayList<Integer>();
//        myarrl.add(5);
//        myarrl.add(10);
//        myarrl.add(15);
//        myarrl.add(0,20);
//        myarrl.remove(2);
//
//        System.out.println(myarrl.get(0));
//        for(Integer e: myarrl){
//            System.out.println(e);
//        }



        System.out.println("Enter the values you want to store");
        for(int i = 0 ; i < 10 ; i++){
            myarrl.add(input.nextInt());
        }

        ArrayList<Integer> arreven = new ArrayList<Integer>();
        ArrayList<Integer> arrodd = new ArrayList<Integer>();


            for (Integer x : myarrl) {
                if (x % 2 == 0) {
                    arreven.add(x);
                }

                else {
                    arrodd.add(x);
                }
            }
            System.out.println(arreven);
            System.out.println(arrodd);
    }
}
