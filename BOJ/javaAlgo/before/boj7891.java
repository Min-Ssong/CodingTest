package BOJ.javaAlgo.before;

import java.math.BigInteger;
import java.util.Scanner;

public class boj7891 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        String[] result = new String[len];
        for( int i = 0; i < len ; i++ ) {
            BigInteger bi_1 = new BigInteger(sc.next());
            result[i] = String.valueOf(bi_1.add(new BigInteger(sc.next())));
        }

        for (String aString : result) {
            System.out.println(aString);
        }
        
        sc.close();
    }
}
