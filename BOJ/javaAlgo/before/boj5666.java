package BOJ.javaAlgo.before;

import java.io.*;

public class boj5666 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String HP = "";
        while ( (HP = br.readLine()) != null ) {
            Double H = Double.parseDouble(HP.split(" ")[0]);
            Double P = Double.parseDouble(HP.split(" ")[1]);
            System.out.printf("%.2f\n", H / P);
        }
    }
}
