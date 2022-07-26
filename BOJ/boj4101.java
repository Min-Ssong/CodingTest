package BOJ;

import java.util.Scanner;

public class boj4101 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while( sc.hasNext() ){
            int a = sc.nextInt();
            int b = sc.nextInt();
            if( a > b ) {
                System.out.println("Yes");
            } else if( a == 0 && b == 0){
                sc.close();
                return;
            } else { 
                System.out.println("No");
            }
        }

        sc.close();
    }
}
