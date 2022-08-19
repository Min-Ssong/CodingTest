package BOJ.javaAlgo;

import java.util.Scanner;

public class boj17903 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();
        String temp = "";
        for ( int i = 0; i <= M; i++ ) {
            temp += sc.nextLine();
        }
        System.out.println( ( M >= 8 ) ? "satisfactory" : "unsatisfactory" );
        sc.close();
    }
}
