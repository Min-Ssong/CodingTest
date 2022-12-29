package BOJ.javaAlgo.before;

import java.io.*;
import java.util.Arrays;

public class boj18411 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int[] inputs = { Integer.parseInt(input.split(" ")[0]), 
            Integer.parseInt(input.split(" ")[1]), 
            Integer.parseInt(input.split(" ")[2])
        };
        Arrays.sort(inputs);
        System.out.print(inputs[1] + inputs[2]);
        br.close();
    }
}
