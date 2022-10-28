package SWEA.D2;

import java.util.Scanner;

public class D2_1859 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int T = sc.nextInt();
        for ( int test_case = 1; test_case <= T; test_case++ ) {
            int[] scores = new int[101];
            int test_case_number = sc.nextInt();
            sb.append("#" + test_case_number + " ");
            for ( int i = 0; i < 1000; i++ ) {
                int score = sc.nextInt();
                scores[score] += 1;
            }
            
            int max = Integer.MIN_VALUE;
            int freq = 0;
            for ( int i = 0; i < scores.length; i++ ) {
                if ( scores[i] > max ) {
                    freq = i;
                    max = scores[i];
                }
            }
            sb.append(freq + "\n");
        }
        System.out.print(sb);
        sc.close();
    }
}
