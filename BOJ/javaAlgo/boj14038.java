package BOJ.javaAlgo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj14038 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = 0;
        String result = "";
        for ( int i = 0; i < 6; i++ ) {
            if( br.readLine().equals("W") ) {
                count += 1;
            }
        }
        if ( count >= 5 ) {
            result = "1";
        } else if ( count >= 3) {
            result = "2";
        } else if ( count >= 1) {
            result = "3";
        } else {
            result = "-1";
        }
        System.out.print(result);
        br.close();
    }    
}
