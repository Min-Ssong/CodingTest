package BOJ.javaAlgo;

import java.io.*;

public class boj3533 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String allInput = br.readLine();
        int count = 0;
        for (String str : allInput.split(" ")) {
            int num = Integer.parseInt(str);
            if ( num == 1 ) {
                count += 1;
            }
        }
        System.out.print((count % 2 == 0) ? "0" : "1");
        br.close();
    }
}
