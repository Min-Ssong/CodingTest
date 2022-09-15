package BOJ.javaAlgo;

import java.io.*;

public class boj4117 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String result = "";
        while ( true ) {
            String allInput = br.readLine();
            if ( allInput.equals("0 0 0 0") ) {
                System.out.print(result);
                break;
            }

            int N = Integer.parseInt(allInput.split(" ")[0]);
            int T1 = Integer.parseInt(allInput.split(" ")[1]);
            int T2 = Integer.parseInt(allInput.split(" ")[2]);
            int T3 = Integer.parseInt(allInput.split(" ")[3]);
            int num = N * 4 - 1;
            if ( T1 < T2 ) {
                num += T2 - T1;
            } else if ( T1 > T2 ) {
                num += (N - T1) + T2;
            }
        
            if ( T3 > T2 ) {
                num += (N - T3) + T2;
            } else if ( T3 < T2 ) {
                num += T2 - T3;
            }

            result += num + "\n";
        }
        br.close();
    }
}
