package BOJ.javaAlgo;

import java.util.Scanner;

public class boj25314 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        System.out.println("long ".repeat(num/4) + "int");
        sc.close();
    }
}
