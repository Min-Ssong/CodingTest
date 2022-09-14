package BOJ.javaAlgo;

import java.util.Scanner;

public class boj5220 {
    private static boolean solveErrorDetection(int value, int checkbit) {
        boolean valid = false;
        int count = 0;
        String[] valueStrArr = Integer.toBinaryString(value).split("");
        for ( int i = 0; i < valueStrArr.length; i++ ) {
            count += (Integer.parseInt(valueStrArr[i]) == 1) ? 1 : 0;
        }
        if ( count % 2 == checkbit ) {
            valid = true;
        }
        return valid;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numCases = sc.nextInt();

        for ( int i = 0; i < numCases; i++) {
            int value = sc.nextInt();
            int checkbit = sc.nextInt();

            if (solveErrorDetection(value, checkbit)) {
                System.out.println("Valid");
            } else {
                System.out.println("Corrupt");
            }
        }
    }
}