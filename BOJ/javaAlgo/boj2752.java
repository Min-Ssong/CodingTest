package BOJ.javaAlgo;

import java.io.*;
import java.util.Arrays;

public class boj2752 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String nums = br.readLine();
        int[] num = {Integer.parseInt(nums.split(" ")[0]), Integer.parseInt(nums.split(" ")[1]), Integer.parseInt(nums.split(" ")[2])};
        Arrays.sort(num);
        for (int i : num) {
            System.out.print(i + " ");
        }
        br.close();
    }
}
