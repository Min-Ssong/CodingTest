import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int resultNum = 0;
        int max = 0;
        for ( int i = 0; i < 4; i++ ) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int startNum = Integer.parseInt(st.nextToken());
            int endNum = Integer.parseInt(st.nextToken());
            if ( i == 0 ) {
                resultNum += endNum;
            } else {
                resultNum += endNum - startNum;
            }
            max = (max < resultNum) ? resultNum : max;
        }
        System.out.print(max);
        br.close();
    }
}
