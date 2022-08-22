package BOJ.javaAlgo;

import java.io.*;

public class boj21591 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int width = Integer.parseInt(input.split(" ")[0]) - Integer.parseInt(input.split(" ")[2]);
        int height = Integer.parseInt(input.split(" ")[1]) - Integer.parseInt(input.split(" ")[3]);

        System.out.print( ( width >= 1 && height >= 1 ) ? 1 : 0 );
        br.close();
    }
}