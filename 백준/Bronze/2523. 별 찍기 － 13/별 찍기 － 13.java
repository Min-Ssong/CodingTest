import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for ( int i = 1; i <= N; i++ ) {
            System.out.printf("%s%s\n",
                "*".repeat(i),
                " ".repeat(1)
            );
        }
        for ( int i = N - 1; i >= 1; i-- ) {
            System.out.printf("%s%s\n",
                "*".repeat(i),
                " ".repeat(1)
            );
        }
        br.close();
    }
}
