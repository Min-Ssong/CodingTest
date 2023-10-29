import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int calcPrice = 0;
        int allPrice = sc.nextInt();
        int len = sc.nextInt();
        for( int i = 0; i < len; i++ ) {
            int price = Integer.parseInt(sc.next());
            int num = Integer.parseInt(sc.next());
            calcPrice += price * num;
        }

        if( calcPrice == allPrice ) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        sc.close();
    }
}
