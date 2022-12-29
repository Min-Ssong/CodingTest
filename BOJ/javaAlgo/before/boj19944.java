package BOJ.javaAlgo.before;

import java.io.*;

public class boj19944 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String allInput = br.readLine();
        int N = Integer.parseInt(allInput.split(" ")[0]);
        int M = Integer.parseInt(allInput.split(" ")[1]);
        if ( M == 1 || M == 2 ) {
            System.out.print("NEWBIE!");
        } else if ( M <= N && !(M == 1 || M == 2)) {
            System.out.print("OLDBIE!");
        } else {
            System.out.print("TLE!");
        }
        br.close();
    }
}
