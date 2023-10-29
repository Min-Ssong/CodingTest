import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String A = br.readLine();
        String B = br.readLine();

        int aAttack = Integer.parseInt(A.split(" ")[0]);
        int aHp = Integer.parseInt(A.split(" ")[1]);
        int bAttack = Integer.parseInt(B.split(" ")[0]);
        int bHp = Integer.parseInt(B.split(" ")[1]);

        while ( true ) {
            aHp -= bAttack;
            bHp -= aAttack;
            if ( aHp >= 1 && bHp <= 0 ) {
                System.out.println("PLAYER A");
                break;
            } else if ( aHp <= 0 && bHp >= 1) {
                System.out.println("PLAYER B");
                break;
            } else if ( aHp <= 0 && bHp <= 0 ) {
                System.out.println("DRAW");
                break;
            }
        }
        br.close();
    }
}