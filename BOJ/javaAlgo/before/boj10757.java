package BOJ.javaAlgo.before;

import java.math.BigInteger;
import java.util.Scanner;

public class boj10757 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        BigInteger bi1 = new BigInteger(str.trim().split(" ")[0]);
        BigInteger bi2 = new BigInteger(str.trim().split(" ")[1]);
        System.out.printf("%d", bi1.add(bi2));

        sc.close();
    }
}
