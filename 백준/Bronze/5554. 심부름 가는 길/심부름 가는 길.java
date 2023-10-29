import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sec = 0;
        for( int i = 0; i < 4; i++ ) {
            sec += sc.nextInt();
        }
        System.out.println(sec / 60);
        System.out.println(sec % 60);
        sc.close();
    }
}
