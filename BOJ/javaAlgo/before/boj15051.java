package BOJ.javaAlgo.before;

import java.io.*;

public class boj15051 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] humans = {Integer.parseInt(br.readLine()),
            Integer.parseInt(br.readLine()),
            Integer.parseInt(br.readLine())};
        int[] result = { ( humans[1] * 2 ) + ( humans[2] * 4 ),
            ( humans[0] * 2 ) + ( humans[2] * 2 ),
            ( humans[0] * 4 ) + ( humans[1] * 2 )};
        
        if ( result[0] < result[1] ) {
            System.out.println(Math.min(result[0], result[2]));
        } else {
            System.out.println(Math.min(result[1], result[2]));
        }

        br.close();
    }
}
