package BOJ.javaAlgo.before;

import java.io.*;

public class boj2875 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String allInput = br.readLine();
        int N = Integer.parseInt(allInput.split(" ")[0]);
        int M = Integer.parseInt(allInput.split(" ")[1]);
        int K = Integer.parseInt(allInput.split(" ")[2]);
        int answer = 0;

        while ( N >= 2 && M >= 1 && N + M - 3 >= K ) {
            N -= 2;
            M -= 1;
            answer += 1;
        }
        System.out.println(answer);

        br.close();
    }
}
