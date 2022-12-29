package BOJ.javaAlgo.before;

import java.io.*;

public class boj21354 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int apple = Integer.parseInt(input.split(" ")[0]) * 7;
        int pear = Integer.parseInt(input.split(" ")[1]) * 13;
        if ( apple == pear ) {
            System.out.print("lika");
        } else {
            System.out.print((apple > pear) ? "Axel" : "Petra");
        }
        br.close();
    }
}
