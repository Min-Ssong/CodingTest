package BOJ.javaAlgo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj11282 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print((char)(Integer.parseInt(br.readLine()) + 44031));
        br.close();
    }
}
