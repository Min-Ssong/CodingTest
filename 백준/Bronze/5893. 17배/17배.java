import java.math.BigInteger;
import java.util.Scanner;
import java.util.function.BinaryOperator;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BigInteger bi = new BigInteger(sc.next(), 2);
        BigInteger result = bi.multiply(new BigInteger("17"));
        
        String last = "";
        while ( result != BigInteger.valueOf(0) ) {
            last += result.mod(BigInteger.valueOf(2));
            result = result.divide(BigInteger.valueOf(2));
        }

        for ( int i = last.length()-1; i >= 0; i-- ) {
            System.out.print(String.valueOf(last.charAt(i)));
        }

        sc.close();
    }
}
