package BOJ.javaAlgo;

import java.io.*;

public class boj18409 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String len = br.readLine();
        String word = br.readLine();
        int count = 0;
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        for ( int i = 0; i < Integer.parseInt(len); i++ ) {
            for ( int j = 0; j < vowels.length; j++ ) {
                if ( word.toCharArray()[i] == vowels[j] ) {
                    count += 1;
                }
            }
        }
        System.out.print(count);
        br.close();
    }
}
