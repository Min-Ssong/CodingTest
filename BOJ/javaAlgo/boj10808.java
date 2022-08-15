package BOJ.javaAlgo;

import java.io.*;

public class boj10808 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] result = new int[26];
        byte[] charBytes = br.readLine().getBytes();
        for ( int i = 0; i < charBytes.length; i++ ) {
            result[charBytes[i] - 97] += 1;
        }

        for (int b : result) {
            System.out.print(b + " ");
        }

        br.close();
    }
}
