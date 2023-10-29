import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int temp = 0;
        int result = 0;
        for ( int i = 0; i < N; i++ ) {
            int num = Integer.parseInt(st.nextToken());
            if ( num == 1 ) {
                temp += 1;
            } else {
                temp = 0;
            }
            result += temp;
        }
        System.out.println(result);
        br.close();
    }
}
