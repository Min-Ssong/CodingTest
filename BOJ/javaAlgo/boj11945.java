package BOJ.javaAlgo;

import java.io.*;

public class boj11945 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String len = br.readLine();
        int height = Integer.parseInt(len.split(" ")[0]);
        int width = Integer.parseInt(len.split(" ")[1]);
        String temp = "";
        for ( int i = 0; i < height; i++ ) {
            for ( int j = width-1; j >= 0; j-- ) {
                temp += br.readLine().toCharArray()[j];
            }
            temp += "\n";
        }
        System.out.print(temp);
        
        br.close();
    }
}
