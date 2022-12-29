package BOJ.javaAlgo.before;

import java.io.*;
import java.util.StringTokenizer;

public class boj2783 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String seven25 = br.readLine();
        Double sevenX = Double.parseDouble(seven25.split(" ")[0]);
        Double sevenY = Double.parseDouble(seven25.split(" ")[1]);
        int T = Integer.parseInt(br.readLine());
        Double min = 9999.99;
        for ( int i = 0; i < T; i++ ) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            Double X = Double.parseDouble(st.nextToken());
            Double Y = Double.parseDouble(st.nextToken());
            Double temp = (1 / Y) * X * 1000;
            min = ( min > temp ) ? temp : min;
        }
        Double sevenValue = (1 / sevenY) * sevenX * 1000;
        System.out.printf("%.2f", (min > sevenValue) ? sevenValue : min);
        br.close();
    }
}
