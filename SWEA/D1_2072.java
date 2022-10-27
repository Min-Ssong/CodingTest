package SWEA;

import java.util.Scanner;

public class D1_2072 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
		int T = sc.nextInt();
		for(int test_case = 1; test_case <= T; test_case++) {
            int resultNum = 0;
            for ( int i = 0; i < 10; i++ ) {
                int num = sc.nextInt();
                if ( num % 2 != 0 ) {
                    resultNum += num;
                }
            }
            sb.append("#").append(test_case + " ").append(resultNum).append("\n");
		}
        System.out.print(sb);
        sc.close();
    }
}
