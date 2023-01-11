package BOJ.javaAlgo.before;

import java.util.Scanner;

public class boj5928 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        int hour = sc.nextInt();
        int min = sc.nextInt();

        int timeF = day * 24 * 60 + hour * 60 + min;
        int timeI = 11 * 24 * 60 + 11 * 60 + 11;
        int result = timeF - timeI;
        System.out.printf("%d", result < 0 ? -1 : result);

        sc.close();
    }
}
