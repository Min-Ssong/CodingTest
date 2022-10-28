package SWEA.D2;

import java.util.Scanner;

public class D2_1284 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int T = sc.nextInt();
        for ( int i = 1; i <= T; i++ ) {
            sb.append("#" + i + " ");
            int p = sc.nextInt();
            int q = sc.nextInt();
            int r = sc.nextInt();
            int s = sc.nextInt();
            int w = sc.nextInt();

            int a = p * w;
            int b = w <= r ? q : q + (w - r) * s;
            
            sb.append(a >= b ? b : a).append("\n");
        }
        System.out.println(sb);
        sc.close();
    }
}
