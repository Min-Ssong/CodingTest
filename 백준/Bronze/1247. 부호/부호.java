import java.io.*;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        for ( int i = 0; i < 3; i++ ) {
            int loopNum = Integer.parseInt(br.readLine());
            BigInteger boxBigInt = BigInteger.ZERO;
            for ( int j = 0; j < loopNum; j++ ) {
                boxBigInt = boxBigInt.add(new BigInteger(br.readLine()));
            }
            int flag = boxBigInt.compareTo(BigInteger.ZERO);
            sb.append(flag == 0 ? "0\n" : flag > 0 ? "+\n" : "-\n");
            boxBigInt = BigInteger.ZERO;
        }
        System.out.print(sb);
        br.close();
    }
}