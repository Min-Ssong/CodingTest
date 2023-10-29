import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String result = "";
        int[] score = new int[5];
        int max = 0;
        for ( int i = 0; i < 5; i++ ) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            for ( int j = 0; j < 4; j++ ) {
                score[i] += Integer.parseInt(st.nextToken());
            }

            if ( max < score[i] ) {
                max = score[i];
                result = (i + 1) + " " + score[i];
            }
        }

        System.out.print(result);
        br.close();
    }
}
