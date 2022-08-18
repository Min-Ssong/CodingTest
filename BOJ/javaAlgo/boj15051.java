package BOJ.javaAlgo;

import java.io.*;

public class boj15051 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] humans = {Integer.parseInt(br.readLine()),
            Integer.parseInt(br.readLine()),
            Integer.parseInt(br.readLine())};
        int num = 0;
        if ( humans[0] > humans[1] ) {
            num = ( humans[0] > humans[2] ) ? 0 : 2;
        } else if ( humans[0] < humans[1] ){
            num = ( humans[1] > humans[2] ) ? 1 : 2;
        } else if ( humans[0] == humans[1] || humans[1] == humans[2]) {
            num = 1;
        } 

        if ( num == 0 ) {
            System.out.print(humans[1] * 2 + humans[2] * 4);
        } else if ( num == 1 ) {
            System.out.print(humans[0] * 2 + humans[2] * 2);
        } else if ( num == 2 ) {
            System.out.print(humans[0] * 4 + humans[1] * 2);
        }

        br.close();
    }
}
