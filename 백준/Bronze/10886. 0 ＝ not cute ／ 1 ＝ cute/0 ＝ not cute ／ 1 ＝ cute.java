import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int count = 0;
        for ( int i = 0; i < T; i++ ) {
            String answer = br.readLine();
            if ( answer.equals("1") ) {
                count += 1;
            } else {
                count -= 1;
            }
        }
        System.out.print(count > 0 ? "Junhee is cute!" : "Junhee is not cute!");
        br.close();
    }
}