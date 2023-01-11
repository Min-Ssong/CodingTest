package BOJ.javaAlgo.before;

import java.util.Scanner;

public class boj11382 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] str = in.nextLine().trim().split(" ");
        long result = 0;

        for(int i = 0; i < str.length; i++) {
            result += Long.parseLong(str[i]);
        }

        System.out.print(result);
        in.close();
    }
}