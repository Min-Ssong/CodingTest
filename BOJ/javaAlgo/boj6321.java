package BOJ.javaAlgo;

import java.io.*;

public class boj6321 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        for ( int i = 0; i < N; i++ ) {
            sb.append("String #" + (i+1) + "\n");
            String str = br.readLine();
            char[] strArr = str.toCharArray();
            for ( int j = 0; j < strArr.length; j++ ) {

                int charNum = strArr[j];
                
                if ( charNum == 90 ) {
                    charNum = 64;
                }

                sb.append((char)(charNum + 1));
            }
            sb.append("\n\n");
        }
        System.out.print(sb);
        br.close();
    }
}
