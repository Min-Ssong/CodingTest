import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for ( int i = N; i >= 1; i-- ) {
            System.out.printf("%"+N+"s\n", "*".repeat(i));
        }
        br.close();
    }
}
