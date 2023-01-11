package BOJ.javaAlgo.before;

import java.io.*;
import java.util.Arrays;

public class boj4153 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while (true) {
            String sides = br.readLine();
            if ( sides.equals("0 0 0") ) {
                break;
            }
            int[] side = {
                Integer.parseInt(sides.split(" ")[0]), 
                Integer.parseInt(sides.split(" ")[1]), 
                Integer.parseInt(sides.split(" ")[2])
            };
            Arrays.sort(side);
            if ( (int)Math.pow(side[2], 2) == ((int)Math.pow(side[0], 2) + (int)Math.pow(side[1], 2))) {
                sb.append("right\n");
            } else {
                sb.append("wrong\n");
            }
        }
        System.out.print(sb);
        br.close();
    }
}
