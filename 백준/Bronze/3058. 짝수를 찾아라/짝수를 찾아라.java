import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        String result = "";
        int resultNum = 0;
        int min = 101;
        for ( int i = 0; i < T; i++ ) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for ( int j = 0; j < 7; j++ ) {
                int num = Integer.parseInt(st.nextToken());
                if ( num % 2 == 0 ) {
                    resultNum += num;
                    min = (num < min) ? num : min;
                }
            }
            result += resultNum + " " + min + "\n";
            resultNum = 0;
            min = 101;
        }
        System.out.print(result);
        br.close();
    }
}
