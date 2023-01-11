package BOJ.javaAlgo.before;

import java.util.Scanner;

public class boj11945 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int height = sc.nextInt();
        int width = sc.nextInt();
        String temp = "";
        for ( int i = 0; i < height; i++ ) {
            while ( sc.hasNext() ) {
                StringBuilder sb = new StringBuilder(sc.next());
                temp += sb.reverse() + "\n";
            }
        }
        System.out.print(temp);
        
        sc.close();
    }
}
