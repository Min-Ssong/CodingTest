package BOJ.javaAlgo;

import java.io.*;

public class boj21631 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] checker = br.readLine().split(" ");

        Long white = Long.parseLong(checker[0]);
        Long black = Long.parseLong(checker[1]);

        System.out.print( (white >= black) ? black : white + 1);
        
        br.close();
    }
}
