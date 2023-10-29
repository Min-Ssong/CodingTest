import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int max = 0;
        String result = "";
        for ( int i = 1; i <= 9; i++ ) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for ( int j = 1; j <= 9; j++ ) {
                int num = Integer.parseInt(st.nextToken());
                if ( num >= max ) {
                    max = num;
                    result = String.format("%d\n%d %d", max, i, j);
                }
            }
        }
        System.out.print(result);
        br.close();
    }
}
