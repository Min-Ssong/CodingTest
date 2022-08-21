package BOJ.javaAlgo;

import java.io.*;
import java.util.Arrays;

public class boj18414 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String xlr = br.readLine();
        int[] xlrInt = {Integer.parseInt(xlr.split(" ")[0]),
            Integer.parseInt(xlr.split(" ")[1]),
            Integer.parseInt(xlr.split(" ")[2])};
        Arrays.sort(xlrInt);
        System.out.print(xlrInt[1]);
        br.close();
    }
}
