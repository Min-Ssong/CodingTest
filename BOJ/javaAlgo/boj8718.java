package BOJ.javaAlgo;

import java.util.Scanner;

public class boj8718 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt() * 1000;
        int k = sc.nextInt() * 1000;

        if (7*k <= x) {
            System.out.println(String.valueOf(7*k*1000));
        } else if (3.5*k <= x) {
            System.out.println(Integer.toString((int)(3.5 * k * 1000)));
        } else if (1.75*k <= x) {
            System.out.println(Integer.toString((int)(1.75 * k * 1000)));
        } else {
            System.out.println(0);
        }

        sc.close();
    }
}
