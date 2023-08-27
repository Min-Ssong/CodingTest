package BOJ.javaAlgo.Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj27433 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long N = Long.parseLong(br.readLine());
		System.out.println(facto(N));
    }

    public static long facto(long num){
		if(num <= 1){
			return 1;
		} else {
			return num * facto(num - 1);
		}
	}
}
