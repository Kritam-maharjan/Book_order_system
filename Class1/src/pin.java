import java.util.Scanner;

public class pin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pass = 1234;
        int count = 0;

        System.out.println("Enter Pin.");
        int user = input.nextInt();
        while(pass != user) {
            if(count>=2){
                System.out.println("locked");
                break;
            }
            System.out.println("Try again");
            user = input.nextInt();
            count = count +1;
        }
        System.out.println("Right");
    }
}
