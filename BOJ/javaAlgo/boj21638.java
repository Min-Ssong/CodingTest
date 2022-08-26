package BOJ.javaAlgo;

import java.io.*;

public class boj21638 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String one = br.readLine();
        String two = br.readLine();
        int T1 = Integer.parseInt(one.split(" ")[0]);
        int V1 = Integer.parseInt(one.split(" ")[1]);
        int T2 = Integer.parseInt(two.split(" ")[0]);
        int V2 = Integer.parseInt(two.split(" ")[1]);

        if ( T2 < 0 && V2 >= 10 ) {
            System.out.print("A storm warning for tomorrow! Be careful and stay home if possible!");
        } else if ( T2 < T1 ) {
            System.out.print("MCHS warns! Low temperature is expected tomorrow.");
        } else if ( V2 > V1 ) {
            System.out.print("MCHS warns! Strong wind is expected tomorrow.");
        } else {
            System.out.print("No message");
        }
        br.close();
    }
}
