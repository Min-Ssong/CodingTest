package BOJ.javaAlgo.before;

import java.io.*;

public class boj25630 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        String s = br.readLine();
        String palindrome = "";
        int count = 0;
        if ( N % 2 == 0 ) {
            palindrome = s.substring(0, N/2);
            palindrome += sb.append(palindrome).reverse();
        } else {
            palindrome = s.substring(0, N/2+1);
            String palindromeMinusOneChar = palindrome.substring(0, palindrome.length()-1);
            palindrome += sb.append(palindromeMinusOneChar).reverse();
        }
        for ( int i = 0; i < s.toCharArray().length; i++ ) {
            count += ( s.charAt(i) != palindrome.charAt(i) ) ? 1 : 0;
        }
        System.out.println(count);
        br.close();
    }
}
