import java.io.*;
import java.util.*;
import java.math.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        BigInteger password = new BigInteger(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        
        boolean[] isPrime = new boolean[K + 1];
        for(int i = 2; i <= K; i++){
            isPrime[i] = true;
        }
        
        for(int i = 2; i <= Math.sqrt(K); i++){
            if(isPrime[i]) {
                for(int j = i * i; j <= K; j += i){
                    isPrime[j] = false;
                }
            }
        }
        
        for(int i = 2; i < K; i++){
            if(isPrime[i]){
                BigInteger temp = BigInteger.valueOf(i);
                if(password.remainder(temp).equals(BigInteger.ZERO)){
                    System.out.println("BAD " + i);
                    return;
                }
            }
        }
        System.out.println("GOOD");
    }
}