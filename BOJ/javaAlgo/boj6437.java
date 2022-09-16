package BOJ.javaAlgo;

import java.io.*;

public class boj6437 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int i = 1;
        while ( true ) {
            String ps = br.readLine();
            if ( ps.equals("0 0") ) {
                System.out.print(sb);
                break;
            }
            
            int p = Integer.parseInt(ps.split(" ")[0]);
            int s = Integer.parseInt(ps.split(" ")[1]);
            sb.append("Hole #" + i + "\n");
            if ( s == 1 ) {
                sb.append("Hole-in-one.");
            } else {
                int num = s - p;
                if ( num >= 2) {
                    sb.append("Double Bogey.");
                } else if ( num == 1 ) {
                    sb.append("Bogey.");
                } else if ( num == 0 ) {
                    sb.append("Par.");
                } else if ( num == -1 ) {
                    sb.append("Birdie.");
                } else if ( num == -2 ) {
                    sb.append("Eagle.");
                } else if ( num <= -3 ) {
                    sb.append("Double Eagle.");
                }
            }
            i += 1;
            sb.append("\n\n");
        }
        br.close();
    }
}
