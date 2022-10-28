package SWEA.D1;

import java.util.Scanner;

public class D1_1545 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int n = sc.nextInt();
        for ( int i = n; i >= 0; i-- ) {
            sb.append(i != 0 ? i + " " : i);
        }
        System.out.print(sb);
        sc.close();
    }
}
