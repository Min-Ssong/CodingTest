package BOJ.javaAlgo;

import java.io.*;

public class boj13866 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String rl = br.readLine();
        int A = Integer.parseInt(rl.split(" ")[0]);
        int B = Integer.parseInt(rl.split(" ")[1]);
        int C = Integer.parseInt(rl.split(" ")[2]);
        int D = Integer.parseInt(rl.split(" ")[3]);
        System.out.print(Math.abs((A+D)-(B+C)));
        br.close();
    }
}
