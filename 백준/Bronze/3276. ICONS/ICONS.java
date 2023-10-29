import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int A = 0;
        int B = 0;
        int flag = 1;
        while ( true ) {
            if ( N <= A * B ) {
                System.out.printf("%d %d", A, B);
                break;
            }
            
            if ( flag % 2 == 0 ) {
                B += 1;
            } else {
                A += 1;
            }

            flag += 1;
        }
        br.close();
    }
}
