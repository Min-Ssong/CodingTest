package SWEA;

import java.util.Scanner;

public class D1_2029 {
    public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
		int T = sc.nextInt();
		for(int test_case = 1; test_case <= T; test_case++) {
            sb.append("#"+test_case+" ");
            int a = sc.nextInt();
            int b = sc.nextInt();
            sb.append(a / b + " ").append(a % b).append("\n");
		}
        System.out.print(sb);
        sc.close();
	}
}
