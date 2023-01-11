package BOJ.javaAlgo.before;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class boj10817 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] tempArr = { Integer.parseInt(st.nextToken()),
            Integer.parseInt(st.nextToken()),
            Integer.parseInt(st.nextToken()) };
        Arrays.sort(tempArr);
        System.out.print(tempArr[1]);
        br.close();
    }
}
