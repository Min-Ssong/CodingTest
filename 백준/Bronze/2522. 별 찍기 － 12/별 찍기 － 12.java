import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for ( int i = N-1; i >= 0; i-- ) {
            System.out.printf("%s%s\n",
                " ".repeat(i),
                "*".repeat(N-i)
            );
        }
        for ( int i = 1; i < N; i++ ) {
            System.out.printf("%s%s\n",
                " ".repeat(i),
                "*".repeat(N-i)
            );
        }
        br.close();
    }
}
