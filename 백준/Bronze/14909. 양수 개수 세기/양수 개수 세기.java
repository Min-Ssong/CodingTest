import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int count = 0;
        while ( st.hasMoreTokens() ) {
            int num = Integer.parseInt(st.nextToken());
            count += (num > 0) ? 1 : 0;
        }
        System.out.print(count);
        br.close();
    }
}
