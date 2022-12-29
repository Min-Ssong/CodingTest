package BOJ.javaAlgo.before;

import java.io.*;

public class boj10987 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();
        char[] ch = word.toCharArray();
        int count = 0;
        for ( int i = 0; i < ch.length; i++ ) {
            int num = (int)ch[i];
            if ( num == 97 || num == 101 || num == 105 || num == 111 || num == 117 ) {
                count += 1;
            }
        }
        System.out.print(count);
        br.close();
    }
}
