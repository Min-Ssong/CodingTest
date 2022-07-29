package BOJ.javaAlgo;

import java.util.Scanner;

public class boj4589 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        String resultStr = "Gnomes:\n";
        for( int i = 0; i < len; i++ ) {
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            int num3 = sc.nextInt();
            if( (num1 - num2) > 0 ) {
                if( (num2 - num3) > 0 ) {
                    resultStr += "Ordered\n";
                } else {
                    resultStr += "Unordered\n";
                }
            } else if ( (num1 - num2) < 0 ) {
                if ( (num2 - num3) < 0 ) {
                    resultStr += "Ordered\n";
                } else {
                    resultStr += "Unordered\n";
                }
            }
        }
        System.out.print(resultStr);
        sc.close();
    }
}
