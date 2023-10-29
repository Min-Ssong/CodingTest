import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String result = "";
        while ( true ) {
            int N = Integer.parseInt(br.readLine());
            if ( N == 0 ) {
                System.out.print(result);
                break;
            }

            StringTokenizer st = new StringTokenizer(br.readLine());
            int scoreJ = 0;
            int scoreM = 0;
            for ( int i = 0; i < N; i++ ) {
                if ( st.nextToken().equals("0") ) {
                    scoreM += 1;
                } else {
                    scoreJ += 1;
                }
            }
            result += "Mary won "+scoreM+" times and John won "+scoreJ+" times\n";
        }
        br.close();
    }
}
