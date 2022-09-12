package BOJ.javaAlgo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj5102 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String result = "";
        while ( true ) {
            String dolls = br.readLine();
            if ( dolls.equals("0 0") ) {
                System.out.print(result);
                break;
            }
            int doll = Integer.parseInt(dolls.split(" ")[0]) - Integer.parseInt(dolls.split(" ")[1]);
            if ( doll % 2 != 0 ) {
                
            } else {
                result += doll / 2 + "\n";
            }
        }
        br.close();
    }
}
