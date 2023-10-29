import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int round = Integer.parseInt(br.readLine());
        int winnerA = 0;
        int winnerB = 0;
        for ( int i = 0; i < round; i++ ) {
            String AB = br.readLine();
            int A = Integer.parseInt(AB.split(" ")[0]);
            int B = Integer.parseInt(AB.split(" ")[1]);
            if ( A > B ) {
                winnerA += 1;
            } else if ( A < B ) {
                winnerB += 1;
            }
        }
        System.out.println(winnerA + " " + winnerB);
        br.close();
    }
}
