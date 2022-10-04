package BOJ.javaAlgo;

import java.io.*;

public class boj15734 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String LRAs = br.readLine();
        String[] LRA = LRAs.split(" ");
        int L = Integer.parseInt(LRA[0]);
        int R = Integer.parseInt(LRA[1]);
        int A = Integer.parseInt(LRA[2]);

        int sum = L + R + A;
		int temp = A - Math.abs(L - R);

		System.out.println(temp >= 0 ? sum - temp % 2 : sum - Math.abs(temp));
        br.close();
    }
}