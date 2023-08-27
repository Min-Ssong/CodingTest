package BOJ.javaAlgo.Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj25501 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for(int i = 0; i < T; i++){
			System.out.println(isPalindrome(br.readLine()));
		}
    }

    public static int isPalindrome(String str){
		return recursion(str, 0, str.length() - 1, 0);
	}

    public static int recursion(String str, int l, int r, int count){
		count++;
		if(l >= r){
			System.out.print(1 + " ");
			return count;
		} else if(str.charAt(l) != str.charAt(r)){
			System.out.print(0 + " ");
			return count;
		} else return recursion(str, l+1, r-1, count);
	}
}
