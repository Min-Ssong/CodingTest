import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String myMBTI = br.readLine();
        int N = Integer.parseInt(br.readLine());
        int count = 0;
        for ( int i = 0; i < N; i++ ) {
            count += ( myMBTI.equals(br.readLine()) ) ? 1 : 0;
        }
        System.out.print(count);
        br.close();
    }
}