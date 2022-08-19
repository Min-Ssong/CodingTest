package BOJ.javaAlgo;

import java.io.*;

public class boj16017 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String A = br.readLine();
        String B = br.readLine();
        String C = br.readLine();
        String D = br.readLine();
        if ( (A.equals("8") || A.equals("9")) 
            && (D.equals("8") || D.equals("9")) 
            && B.equals(C) ) {
                System.out.print("ignore");
        } else {
            System.out.print("answer");
        }
        br.close();
    }
}
