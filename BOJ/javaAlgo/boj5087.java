package BOJ.javaAlgo;

import java.io.*;

public class boj5087 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String winner = "";
        while ( true ) {
            String cards = br.readLine();
            if ( cards.equals("#") ) {
                System.out.print(winner);
                break;
            }
            String[] card = cards.split(" ");
            int C = 0;
            int T = 0;
            for ( int i = 0; i < card.length; i++ ) {
                if ( card[i].equals("*") ) {
                    break;
                } else if (card[i].equals("A")){
                    C += 1;
                } else {
                    int num = Integer.parseInt(card[i]);
                    if ( num % 2 == 0 ) {
                        T += 1;
                    } else {
                        C += 1;
                    }
                }
            }
            if ( C == T ) {
                winner += "Draw\n";
            } else {
                winner += (C > T) ? "Cheryl\n" : "Tania\n";
            }
        }
        
        br.close();
    }
}
