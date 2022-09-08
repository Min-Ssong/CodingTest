package BOJ.javaAlgo;

import java.io.*;

public class boj4485 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        String result = "";
        for ( int i = 0; i < T; i++ ) {
            String str = br.readLine();
            String[] strArr = str.split("");
            result += strArr[0].toUpperCase() + str.substring(1, str.length()) + "\n";
        }
        System.out.print(result);
        br.close();
    }
}
