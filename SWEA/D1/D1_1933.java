package SWEA.D1;

import java.util.Scanner;

public class D1_1933 {
    public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int n = sc.nextInt();
        sb.append("1 ");
        for ( int i = 2; i < n; i++ ) {
            if ( n % i == 0 ) {
                sb.append(i + " ");
            }
        }
        sb.append(n);
        System.out.print(sb);
        sc.close();
	}
}
