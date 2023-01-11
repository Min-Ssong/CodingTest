package BOJ.javaAlgo.before;

import java.io.*;
import java.util.StringTokenizer;

public class boj25591 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int a = 100 - A;
        int b = 100 - B;
        int c = 100 - (a + b);
        int d = a * b;
        int q = d / 100;
        int r = d % 100;

        sb.append(a).append(" ");
        sb.append(b).append(" ");
        sb.append(c).append(" ");
        sb.append(d).append(" ");
        sb.append(q).append(" ");
        sb.append(r).append("\n");
        sb.append(q + c).append(" ");
        sb.append(r);

        System.out.print(sb);
        br.close();
    }
}
