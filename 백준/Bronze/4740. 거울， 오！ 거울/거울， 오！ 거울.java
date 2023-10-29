import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String result = "";
        while ( true ) {
            String str = br.readLine();
            if ( str.equals("***") ) {
                System.out.print(result);
                break;
            }
            StringBuffer sb = new StringBuffer(str);
            String reverse = sb.reverse().toString();
            result += reverse + "\n";
        }
        br.close();
    }
}
