import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = 0;
        while ( true ) {
            String input = "";
            if ( (input = br.readLine()) != null ) {
                count += 1;
            } else {
                System.out.print(count);
                break;
            }
        }
        br.close();
    }
}
