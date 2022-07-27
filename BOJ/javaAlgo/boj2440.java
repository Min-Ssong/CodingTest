package BOJ.javaAlgo;

import java.util.Scanner;

public class boj2440 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for( int i = num; i >= 1; i-- ) {
            System.out.println("*".repeat(i));
        }
        sc.close();
    }
}
