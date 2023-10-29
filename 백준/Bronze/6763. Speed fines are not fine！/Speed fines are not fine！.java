import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int limit = sc.nextInt();
        int mySpeed = sc.nextInt();
        int over = mySpeed - limit;
        if ( over <= 0 ) {
            System.out.println("Congratulations, you are within the speed limit!");
        } else if ( 1 <= over && over <= 20 ) {
            System.out.println("You are speeding and your fine is $100.");
        } else if ( 21 <= over && over <= 30 ) {
            System.out.println("You are speeding and your fine is $270.");
        } else {
            System.out.println("You are speeding and your fine is $500.");
        }
        System.out.println();
        sc.close();
    }
}
