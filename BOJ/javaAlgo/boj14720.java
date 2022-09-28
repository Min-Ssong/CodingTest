package BOJ.javaAlgo;

import java.io.*;

public class boj14720 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int count = 0;
        String str = br.readLine();
        String[] temp = str.split(" ");
        int num1 = 2;
        for ( int i = 0; i < N; i++ ) {
            int num2 = Integer.parseInt(temp[i]);
            if ( num1 == 2 && num2 == 0 ) {
                count += 1;
                num1 = 0;
            } else if ( num1 == 0 && num2 == 1 ) {
                count += 1;
                num1 += 1;
            } else if ( num1 == 1 && num2 == 2 ) {
                count += 1;
                num1 += 1;
            }
        }
        System.out.println(count);
        br.close();
    }
}
