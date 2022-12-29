package BOJ.javaAlgo.before;

import java.io.*;

public class boj13623 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputs = br.readLine().split(" ");
        if ( inputs[0].equals(inputs[1]) && inputs[0].equals(inputs[2]) ){
            System.out.println("*");
        } else {
            if ( inputs[0].equals(inputs[1]) ) {
                System.out.print("C");
            } else if ( inputs[0].equals(inputs[2]) ) {
                System.out.print("B");
            } else if ( inputs[1].equals(inputs[2]) ) {
                System.out.println("A");
            } 
        }
        br.close();
    }
}
