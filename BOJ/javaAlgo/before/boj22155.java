package BOJ.javaAlgo.before;

import java.io.*;

public class boj22155 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String result = "";
        for ( int i = 0; i < n; i++ ) {
            String con = br.readLine();
            int a = Integer.parseInt(con.split(" ")[0]);
            int b = Integer.parseInt(con.split(" ")[1]);
            if ( (a <= 1 && b <= 2) || (a <= 2 && b <= 1) ) {
                result += "Yes\n";
            } else {
                result += "No\n";
            }
        }
        System.out.print(result);
        br.close();
    }
}