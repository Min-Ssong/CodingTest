package BOJ.javaAlgo;

import java.io.*;

public class boj11121 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String result = "";
        String len = br.readLine();
        for ( int i = 0; i < Integer.parseInt(len); i++ ) {
            String inputs = br.readLine();
            if ( inputs.split(" ")[0].equals(inputs.split(" ")[1]) ) {
                result += "OK\n";
            } else {
                result += "ERROR\n";
            }
        }
        System.out.print(result);
        br.close();
    }
}
