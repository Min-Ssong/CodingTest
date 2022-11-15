package SWEA.D2;

import java.util.Scanner;

public class D2_1288 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int T = sc.nextInt();
        for ( int i = 1; i <= T; i++ ) {
            String str = "0123456789";
            sb.append("#" + i + " ");
            int n = sc.nextInt();
            for ( int j = 1; j <= 100; j++ ) {
                int sumN = n * j;
                while ( true ) {
                    if ( str.equals("") ) {
                        sb.append(sumN + "\n");
                        break;
                    }
                    str = str.replace(String.valueOf(sumN % 10), "");
                    sumN = sumN / 10;
                }
            }
        }
        System.out.print(sb);
        sc.close();
    }
}
