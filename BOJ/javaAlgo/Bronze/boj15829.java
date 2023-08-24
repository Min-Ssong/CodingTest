package BOJ.javaAlgo.Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class boj15829 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int L = Integer.parseInt(br.readLine());
		String str = br.readLine();
		
		int num = 0;
		BigInteger result = new BigInteger("0");
		for(char ch : str.toCharArray()){
            System.out.println(Double.toString((ch - 96) * Math.round(Math.pow(31, num))));
			num += 1;
		}
		System.out.println(result);
    }
}
// 50
// abcdeabcdeabcdeabcdeabcdeabcdeabcdeabcdeabcdeabcde