import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt() * sc.nextInt();
        for( int i = 0; i < 5; i++ ) {
            int paper = sc.nextInt();
            System.out.print(paper - num + " ");
        }

        sc.close();
    }
}
