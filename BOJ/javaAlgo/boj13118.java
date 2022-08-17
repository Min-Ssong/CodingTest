package BOJ.javaAlgo;

import java.io.*;

public class boj13118 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String humanXs = br.readLine();
        String apple = br.readLine();
        String[] humans = humanXs.split(" ");
        String appleX = apple.split(" ")[0];

        String result = "";
        for( int i = 0; i < humans.length; i++ ) {
            if ( humans[i].equals(appleX) ) {
                result = String.valueOf(i+1);
                break;
            } else {
                result = String.valueOf(0);
            }
        }
        System.out.println(result);
        
        br.close();
    }
}
