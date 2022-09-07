package BOJ.javaAlgo;

import java.io.*;

public class boj2712 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        String result = "";
        for ( int i = 0; i < T; i++ ) {
            String allInput = br.readLine();
            Double num = Double.parseDouble(allInput.split(" ")[0]);
            String unit = allInput.split(" ")[1];
            if ( unit.equals("kg") ) {
                result += String.format("%.4f", num * 2.2046) + " lb\n";
            } else if ( unit.equals("lb") ) {
                result += String.format("%.4f", num * 0.4536) + " kg\n";
            } else if ( unit.equals("l") ) {
                result += String.format("%.4f", num * 0.2642) + " g\n";
            } else if ( unit.equals("g") ) {
                result += String.format("%.4f", num * 3.7854) + " l\n";
            }
        }
        System.out.print(result);
        br.close();
    }
}
