import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String result = "";
        for ( int i = 1; i <= 5; i++ ) {
            String name = br.readLine();
            if( name.indexOf("FBI") != -1 ) {
                result += i + " ";
            }
        }
        System.out.print((result.equals("")) ? "HE GOT AWAY!" : result);
        br.close();
    }
}
