package SWEA;

import java.util.Scanner;

public class D1_2050 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
		String s = sc.nextLine();
        char[] alpha = s.toCharArray();
        for (char c : alpha) {
            sb.append(((int)c - 64) + " ");
        }
        System.out.print(sb);
        sc.close();
    }
}
