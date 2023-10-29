import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        String result = "";
        for ( int i = 0; i < T; i++ ) {
            int loop = Integer.parseInt(br.readLine());
            int p1Count = 0;
            int p2Count = 0;
            for ( int j = 0; j < loop; j++ ) {
                String ab = br.readLine();
                String a = ab.split(" ")[0];
                String b = ab.split(" ")[1];

                if ( !(a.equals(b)) ) {
                    if ( a.equals("R") ) {
                        if ( b.equals("S") ) {
                            p1Count += 1;
                        } else {
                            p2Count += 1;
                        }
                    } else if ( a.equals("S") ) {
                        if ( b.equals("P") ) {
                            p1Count += 1;
                        } else {
                            p2Count += 1;
                        }
                    } else if ( a.equals("P") ) {
                        if ( b.equals("R") ) {
                            p1Count += 1;
                        } else {
                            p2Count += 1;
                        }
                    }
                }
            }
            if ( p1Count == p2Count ) {
                result += "TIE\n";
            } else {
                result += (p1Count > p2Count) ? "Player 1\n" : "Player 2\n";
            }
        }
        System.out.print(result);
        br.close();
    }
}
