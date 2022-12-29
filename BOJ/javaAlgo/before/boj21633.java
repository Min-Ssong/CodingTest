package BOJ.javaAlgo.before;

import java.io.*;

public class boj21633 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double K = Double.parseDouble(br.readLine()) * 0.01 + 25;
        if ( K < 100 ) {
            System.out.printf("%.2f", 100.00);
        } else if ( K >= 2000 ){
            System.out.printf( "%.2f", 2000.00 );
        } else {
            System.out.printf( "%.2f", K );
        }
        
        br.close();
    }
}
