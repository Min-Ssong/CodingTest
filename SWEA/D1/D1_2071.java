package SWEA.D1;

import java.util.Scanner;

public class D1_2071 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
		int T = sc.nextInt();
		for(int test_case = 1; test_case <= T; test_case++) {
            Double resultNum = 0.0;
            for ( int i = 0; i < 10; i++ ) {
                resultNum += sc.nextInt();
            }
            sb.append("#"+test_case + " ").append(String.format("%.0f", resultNum/10) + "\n");
		}
        System.out.print(sb);
        sc.close();
    }
}