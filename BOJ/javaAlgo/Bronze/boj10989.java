package BOJ.javaAlgo.Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class boj10989 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
		int num = Integer.parseInt(br.readLine());
        int[] tempArr = new int[num];
        for(int i = 0; i < num; i++){
			tempArr[i] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(tempArr);
		for(int i : tempArr){
			sb.append(i).append("\n");
		}
        System.out.println(sb.toString());
    }
}
