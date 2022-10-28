package SWEA;

import java.util.Scanner;

public class D1_2019 {
    public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        sb.append("1 2 ");
        int n = sc.nextInt();
        for ( int i = 2; i <= n; i++ ) {
            sb.append((int)Math.pow(2, i) + " ");
        }
        System.out.print(sb);
        sc.close();
	}
}
