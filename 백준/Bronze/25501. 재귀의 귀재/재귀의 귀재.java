import java.io.*;
import java.util.*;

public class Main {
    static int count = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            sb.append(isPalindrome(br.readLine().toCharArray()) + "\n");
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }

    public static String isPalindrome(char[] ch){
        count = 0;
        return String.valueOf(recursion(ch, 0, ch.length - 1)) +" "+ count;
    }

    public static int recursion(char[] ch, int l, int r){
        count++;

        if( l >= r ) {
            return 1;
        } else if( ch[l] != ch[r] ){
            return 0;
        } else {
            return recursion(ch, l+1, r-1);
        }
    }
}
