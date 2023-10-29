import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String nT = br.readLine();
        int n = Integer.parseInt(nT.split(" ")[0]);
        int T = Integer.parseInt(nT.split(" ")[1]);
        int result = 0;
        int num = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        for ( int i = 0; i < n; i++ ) {
            int time = Integer.parseInt(st.nextToken());
            result += time;
            num += (result <= T) ? 1 : 0;
        }
        System.out.print(num);
        br.close();
    }
}