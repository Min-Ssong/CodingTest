package BOJ.javaAlgo;

import java.io.*;

public class boj25703 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        System.out.println("int a;");
        System.out.println("int *ptr = &a;");
        for ( int i = 2; i <= num; i++ ) {
            if ( i == 2 ) {
                System.out.println("int " +"*".repeat(i)+ "ptr"+i+" = &ptr;");
            } else {
                System.out.println("int " +"*".repeat(i)+ "ptr"+i+" = &ptr"+(i-1)+";");
            }
        }
        br.close();
    }
}