package BOJ.javaAlgo.before;

import java.io.*;

public class boj18408 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String[] inputs = input.split(" ");
        int one = 0;
        int two = 0;
        for (String string : inputs) {
            if ( string.equals("1") ) {
                one += 1;
            } else {
                two += 1;
            }
        }
        System.out.println( (one > two) ? "1" : "2");
        br.close();
    }
}
