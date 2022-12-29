package BOJ.javaAlgo.before;

import java.io.*;

public class boj10768 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int month = Integer.parseInt(br.readLine());
        int day = Integer.parseInt(br.readLine());
        if ( month < 2 || (month == 2 && day < 18)) {
            bw.write("Before");
        } else if ( month == 2 && day == 18 ) {
            bw.write("Special");
        } else {
            bw.write("After");
        }

        bw.flush();
        br.close();
        bw.close();
    }
}
