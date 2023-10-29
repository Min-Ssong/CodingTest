import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String result = "";
        for ( int i = 1; i <= N; i++ ) {
            result += "Hello World, Judge "+i+"!\n";
        }
        System.out.print(result);
        br.close();
    }
}
