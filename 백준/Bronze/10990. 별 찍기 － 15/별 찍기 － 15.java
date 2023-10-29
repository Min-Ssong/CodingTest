import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        int j = 1;
        for ( int i = 0; i < N; i++ ) {
            if ( i == 0 ) {
                sb.append(" ".repeat(N-(i+1)) + "*").append("\n");
            } else {
                sb.append(" ".repeat(N-(i+1)) + "*");
                sb.append(" ".repeat(N - (N - j)) + "*").append("\n");
                j += 2;
            }
        }
        System.out.println(sb);
        br.close();
    }
}
