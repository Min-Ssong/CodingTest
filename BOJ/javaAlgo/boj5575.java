package BOJ.javaAlgo;

import java.util.Scanner;

public class boj5575 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int startTime = 0;
        int[] h = new int[3];
        int[] m = new int[3];
        int[] s = new int[3];
        for( int i = 0; i < 3; i++ ) {
            for( int j = 0; j < 2; j++ ) {
                int tempTime = sc.nextInt() * 3600;
                tempTime += sc.nextInt() * 60;
                tempTime += sc.nextInt();
                if ( j == 0 ) {
                    startTime += tempTime;
                } else {
                    startTime -= tempTime;
                }
                startTime = Math.abs(startTime);
            }
            h[i] = startTime / 3600;
            startTime = startTime % 3600;
            m[i] = startTime / 60;
            s[i] = startTime % 60;
            startTime = 0;
        }

        for( int i = 0; i < h.length; i++ ) {
            System.out.printf("%d %d %d\n", h[i], m[i], s[i]);
        }
        sc.close();
    }
}