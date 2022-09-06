package BOJ.javaAlgo;

import java.io.*;

public class boj1248 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String result = "";
        int num = 2;
        while ( true ) {
            String N = br.readLine();
            if ( N.equals("0") ) {
                System.out.print(result);
                break;
            } else {
                String[] strArr = N.split("");
                int len = strArr.length;
                for ( int i = 0; i < len; i++ ) {
                    if ( strArr[i].equals("1") ) {
                        num += 2;
                    } else if ( strArr[i].equals("0") ) {
                        num += 4;
                    } else {
                        num += 3;
                    }
                }
                num += (len - 1);
                result += num + "\n";
                num = 2;
            }
        }
        br.close();
    }
}
