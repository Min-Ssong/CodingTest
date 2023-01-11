package BOJ.javaAlgo.before;

import java.io.*;

public class boj5612 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int time = Integer.parseInt(br.readLine());
        int count = Integer.parseInt(br.readLine());
        int max = count;
        boolean flag = false;
        for ( int i = 0; i < time; i++ ) {
            String inOut = br.readLine();
            int in = Integer.parseInt(inOut.split(" ")[0]) - Integer.parseInt(inOut.split(" ")[1]);
            count += in;
            if ( max < count ) {
                max = count;
            }

            if ( count < 0 ) {
                flag = true;
            }
        }
        System.out.print((flag == false) ? max : "0");
        br.close();
    }
}
