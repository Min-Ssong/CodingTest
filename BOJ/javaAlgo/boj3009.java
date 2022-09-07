package BOJ.javaAlgo;

import java.io.*;
import java.util.Arrays;

public class boj3009 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arrX = new int[3];
        int[] arrY = new int[3];
        for ( int i = 0; i < 3; i++ ) {
            String XY = br.readLine();
            arrX[i] = Integer.parseInt(XY.split(" ")[0]);
            arrY[i] = Integer.parseInt(XY.split(" ")[1]);
        }
        Arrays.sort(arrX);
        Arrays.sort(arrY);
        if ( arrX[1] == arrX[2] ) {
            System.out.print((arrY[1] == arrY[2]) 
                ? arrX[0] + " " + arrY[0] : arrX[0] + " " + arrY[2]
            );
        } else {
            System.out.print((arrY[1] == arrY[2]) 
                ? arrX[2] + " " + arrY[0] : arrX[2] + " " + arrY[2]
            );
        }
        br.close();
    }
}
