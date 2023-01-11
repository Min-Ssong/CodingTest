package BOJ.javaAlgo.before;

import java.io.*;

public class boj16727 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String firstGame = br.readLine();
        String seccondGame = br.readLine();
        int preHome = Integer.parseInt(firstGame.split(" ")[0]);
        int preAway = Integer.parseInt(seccondGame.split(" ")[1]);
        int estHome = Integer.parseInt(seccondGame.split(" ")[0]);
        int estAway = Integer.parseInt(firstGame.split(" ")[1]);

        int preTotal = preHome + preAway;
        int estTotal = estHome + estAway;

        if ( preTotal == estTotal ) {
            if ( preAway == estAway ) {
                System.out.println("Penalty");
            } else {
                System.out.println( (preAway > estAway) ? "Persepolis" : "Esteghlal" );
            }
        } else {
            System.out.println( (preTotal > estTotal) ? "Persepolis" : "Esteghlal" );
        }
        br.close();
    }
}
