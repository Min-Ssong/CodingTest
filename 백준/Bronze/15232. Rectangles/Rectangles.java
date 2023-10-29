import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int line = Integer.parseInt(br.readLine());
        int num = Integer.parseInt(br.readLine());
        for ( int i = 0; i < line; i++ ) {
            if ( i == line - 1) {
                System.out.print("*".repeat(num));
                break;
            }
            System.out.print("*".repeat(num) + "\n");
        }
        br.close();
    }
}
