import java.io.*;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String mn = br.readLine();
        String[] arrMn = mn.split(" ");
        BigInteger bi_1 = new BigInteger(arrMn[0]);
        BigInteger bi_2 = new BigInteger(arrMn[1]);
        System.out.println(bi_1.divide(bi_2));
        System.out.println(bi_1.remainder(bi_2));
        br.close();
    }
}