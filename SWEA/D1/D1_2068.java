package SWEA.D1;

import java.util.Scanner;

public class D1_2068 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
		int T = sc.nextInt();
		for(int test_case = 1; test_case <= T; test_case++) {
            sb.append("#" + test_case + " ");
            int max = Integer.MIN_VALUE;
            for ( int i = 0; i < 10; i++ ) {
                int num = sc.nextInt();
                max = num > max ? num : max;
            }
            sb.append(max + "\n");
		}
        System.out.print(sb);
        sc.close();
    }
}
