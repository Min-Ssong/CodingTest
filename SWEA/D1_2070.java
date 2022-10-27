package SWEA;

import java.util.Scanner;

public class D1_2070 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
		int T = sc.nextInt();
		for(int test_case = 1; test_case <= T; test_case++) {
            sb.append("#" + test_case + " ");
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            sb.append(num1 == num2 ? "=" : num1 > num2 ? ">" : "<");
            sb.append("\n");
		}
        System.out.print(sb);
        sc.close();
    }
}
