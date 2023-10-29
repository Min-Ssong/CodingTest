import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int K = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());
        int timeSec = 0;
        for ( int i = 0; i < N; i++ ) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int T = Integer.parseInt(st.nextToken());
            String Z = st.nextToken();
            timeSec += T;            
            if ( timeSec >= 210 ) {
                sb.append(K);
            }

            if ( Z.equals("T") ) {
                K = ( K != 8 ) ? K + 1 : 1;
            }
        }
        System.out.print(sb.charAt(0));
        br.close();
    }
}
