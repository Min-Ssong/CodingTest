package BOJ.javaAlgo.before;

import java.util.Scanner;

public class boj5597 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] attendNumbers = new int[31];
        int inputNum = 0;
        for( int i = 1; i < 29; i++) {
            inputNum = sc.nextInt();
            attendNumbers[inputNum] = 1;
        }

        for(int i=1; i<attendNumbers.length; i++){
            if( attendNumbers[i] != 1 ){
                System.out.printf("%d\n", i);
            }
        }

        sc.close();
    }
}
