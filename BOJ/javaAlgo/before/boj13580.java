package BOJ.javaAlgo.before;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class boj13580 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inputs = br.readLine();
        int[] time = { Integer.parseInt(inputs.split(" ")[0]),
                       Integer.parseInt(inputs.split(" ")[1]),
                       Integer.parseInt(inputs.split(" ")[2])};
        Arrays.sort(time);
        if ( time[0] == time[1] || time[0] == time[2] || time[1] == time[2] ) {
            System.out.print("S");
        } else {
            System.out.println(( time[0] + time[1]  == time[2] ) ? "S" : "N");
        }

        br.close();
    }
}
