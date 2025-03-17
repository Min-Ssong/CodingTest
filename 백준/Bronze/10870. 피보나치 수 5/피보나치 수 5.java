import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int num = Integer.parseInt(br.readLine());
        bw.write(String.valueOf(fibo(num)));
        bw.flush();
        bw.close();
        br.close();
    }

    public static int fibo(int n){
        if( n == 0 ) return 0;
        if( n == 1 || n == 2 ) return 1;
        return fibo(n - 2) + fibo(n - 1);
    }
}
