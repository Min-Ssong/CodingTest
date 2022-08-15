package BOJ.javaAlgo;

import java.io.*;

public class boj10797 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int day = Integer.parseInt(br.readLine());
        String[] carNum = br.readLine().split(" ");
        int count = 0;

        for ( int i = 0; i < carNum.length; i++ ) {
            if( day == Integer.parseInt(carNum[i]) ){
                count++;
            }
        }
        bw.write(String.valueOf(count));

        bw.flush();
        br.close();
        bw.close();
    }
}
