package BOJ.javaAlgo.before;

import java.io.*;
import java.util.Arrays;

public class boj3047 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String allInput = br.readLine();
        int[] ABC = { 
            Integer.parseInt(allInput.split(" ")[0]), 
            Integer.parseInt(allInput.split(" ")[1]),
            Integer.parseInt(allInput.split(" ")[2])
        };
        Arrays.sort(ABC);
        String strABC = br.readLine();
        if ( strABC.split("")[0].equals("A") ) {
            if ( strABC.split("")[1].equals("B") ) {
                System.out.printf("%d %d %d", ABC[0], ABC[1], ABC[2]);
            } else if ( strABC.split("")[1].equals("C") ) {
                System.out.printf("%d %d %d", ABC[0], ABC[2], ABC[1]);
            }
        } else if ( strABC.split("")[0].equals("B") ) {
            if ( strABC.split("")[1].equals("A") ) {
                System.out.printf("%d %d %d", ABC[1], ABC[0], ABC[2]);
            } else if ( strABC.split("")[1].equals("C") ) {
                System.out.printf("%d %d %d", ABC[1], ABC[2], ABC[0]);
            }
        } else if ( strABC.split("")[0].equals("C") ) {
            if ( strABC.split("")[1].equals("A") ) {
                System.out.printf("%d %d %d", ABC[2], ABC[0], ABC[1]);
            } else if ( strABC.split("")[1].equals("B") ) {
                System.out.printf("%d %d %d", ABC[2], ABC[1], ABC[0]);
            }
        }

        br.close();
    }
}
