package BOJ.javaAlgo.Bronze;

import java.io.*;

public class boj10250 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            String HWN = br.readLine();
            int H = Integer.parseInt(HWN.split(" ")[0]);
            int W = Integer.parseInt(HWN.split(" ")[1]);
            int N = Integer.parseInt(HWN.split(" ")[2]);
            sb.append(N % H == 0 ? H * 100 + N / H : N % H * 100 + N / H + 1).append("\n");
        }
        System.out.println(sb);
        br.close();
    }
}