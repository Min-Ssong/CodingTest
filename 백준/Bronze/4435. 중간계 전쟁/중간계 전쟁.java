import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        String result = "";
        for ( int i = 1; i <= T; i++ ) {
            int humanNum = 0;
            int evilNum = 0;
            String humanStr = br.readLine();
            String evilStr = br.readLine();
            String[] humanStrArr = humanStr.split(" ");
            String[] evilStrArr = evilStr.split(" ");
            for ( int j = 0; j < humanStrArr.length; j++ ){
                int num = Integer.parseInt(humanStrArr[j]);
                if ( j == 0 ) {
                    humanNum += num * 1;
                } else if ( j == 1 ) {
                    humanNum += num * 2;
                } else if ( j == 2 || j == 3 ) {
                    humanNum += num * 3;
                } else if ( j == 4 ) {
                    humanNum += num * 4;
                } else if ( j == 5 ) {
                    humanNum += num * 10;
                }
            }

            for ( int j = 0; j < evilStrArr.length; j++ ){
                int num = Integer.parseInt(evilStrArr[j]);
                if ( j == 0 ) {
                    evilNum += num * 1;
                } else if ( j == 1 || j == 2 || j == 3 ) {
                    evilNum += num * 2;
                } else if ( j == 4 ) {
                    evilNum += num * 3;
                } else if ( j == 5 ) {
                    evilNum += num * 5;
                } else if ( j == 6 ) {
                    evilNum += num * 10;
                }
            }
            if ( humanNum == evilNum ) {
                result += "Battle " + i + ": No victor on this battle field\n";
            } else {
                result += (humanNum > evilNum) 
                    ? "Battle " + i + ": Good triumphs over Evil\n" 
                    : "Battle " + i + ": Evil eradicates all trace of Good\n";
            }
        }
        System.out.print(result);
        br.close();
    }
}
