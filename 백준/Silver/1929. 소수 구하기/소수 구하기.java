import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        StringBuilder sb = new StringBuilder();
        
        int startNum = Integer.parseInt(st.nextToken());
        int endNum = Integer.parseInt(st.nextToken());

        boolean[] isPrime = new boolean[endNum + 1];
        Arrays.fill(isPrime, true);
        countPrimes(endNum, isPrime);
        for(int i = startNum; i <= endNum; i++){
            if(isPrime[i]) sb.append(i + "\n");
        }
        System.out.println(sb.toString());
    }

    public static boolean[] countPrimes(int n, boolean[] arr) {
        arr[0] = false;
        arr[1] = false;

        for (int i = 2; i * i <= n; i++) {
            if (arr[i]) {
                for (int j = i * i; j <= n; j += i) {
                    arr[j] = false;
                }
            }
        }

        return arr;
    }
}
