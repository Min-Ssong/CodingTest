package BOJ.javaAlgo;

import java.util.Scanner;

public class boj25372 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        for( int i = 0; i < len; i++ ) {
            String str = sc.next();
            if( str.length() >= 6 && str.length() <= 9) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
        sc.close();
    }
}
