package BOJ.javaAlgo.before;

import java.io.*;
import java.util.*;

public class boj3460 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        String result = "";
        for ( int i = 0; i < T; i++ ) {
            String strBinary = Integer.toBinaryString(Integer.parseInt(br.readLine()));
            String[] arrBinary = strBinary.split("");
            List<String> list = Arrays.asList(arrBinary);
            Collections.reverse(list);
            String[] reverseArrBinary = list.toArray(arrBinary);
            for ( int j = 0; j < reverseArrBinary.length; j++ ) {
                if ( reverseArrBinary[j].equals("1") ) {
                    result += j + " ";
                }
            }
            result += "\n";
        }
        System.out.print(result);
        br.close();
    }
}
