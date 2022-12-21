package BOJ.javaAlgo;

import java.io.*;
import java.util.Arrays;

public class demoQ {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] A = {1, 3, 6, 4, 1, 2};
        //int[] A = {1, 2, 3};
        //int[] A = {-1, -3};

        Arrays.sort(A);
        int middleNum = 0;
        for ( int i = 0; i < A.length; i++ ) {
            if ( i != A.length - 1 && A[i + 1] - A[i] > 1 ) {
                middleNum =  A[i + 1] - 1;
            }
        }

        int lastNum = A[A.length-1];
        if ( lastNum <= 0 ) {
            System.out.println(1);
        } else {
            System.out.println(middleNum != 0 ? middleNum : lastNum + 1);
        }

        br.close();        
    }
}