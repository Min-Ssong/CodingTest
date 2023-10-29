import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int ytFinger = Integer.parseInt(st.nextToken());
        int yjFinger = Integer.parseInt(st.nextToken());
        int count = 1;
        while ( true ) {
            if ( ytFinger > 4 || yjFinger > 4 ) {
                System.out.print((ytFinger > yjFinger) ? "yj" : "yt");
                break;
            }
            
            if ( count % 2 == 0 ) {
                ytFinger += yjFinger;
            } else {
                yjFinger += ytFinger;
            }

            count += 1;
        }
        br.close();
    }
}