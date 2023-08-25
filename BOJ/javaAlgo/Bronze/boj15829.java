package BOJ.javaAlgo.Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj15829 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int L = Integer.parseInt(br.readLine());
		String str = br.readLine();
		
		int num = 1;
		long result = 0;
		for(char ch : str.toCharArray()){
			result += ((ch - 96) * num) % 1234567891;
			num = (num * 31) % 1234567891;
		}
		System.out.println(result % 1234567891);
    }
}