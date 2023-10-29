import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        String result = "";
        for ( int i = 1; i <= num; i++ ) {
            String temp = br.readLine();
            result += i + ". " + temp + "\n";
        }
        System.out.print(result);
        br.close();
    }
}
