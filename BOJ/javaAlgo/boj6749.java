package BOJ.javaAlgo;

import java.util.Scanner;

public class boj6749 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lastChild = sc.nextInt();
        int middleChild = sc.nextInt();
        int diffAge = middleChild - lastChild;
        System.out.println(middleChild + diffAge);
        sc.close();
    }
}
