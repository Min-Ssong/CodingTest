import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String result = "";
        while ( true ) {
            String ND = br.readLine();
            if ( ND.equals("0 0") ) {
                System.out.print(result);
                break;
            }

            String[][] alumn = 
                new String[Integer.parseInt(ND.split(" ")[1])][Integer.parseInt(ND.split(" ")[0])];
            for ( int i = 0; i < alumn.length; i++ ) {
                String temp = br.readLine();
                String[] tempArr = temp.split(" ");
                for ( int j = 0; j < alumn[i].length; j++ ) {
                    alumn[i][j] = tempArr[j];
                }
            }

            String temp = "";
            String temp2 = "";
            for ( int i = 0; i < alumn[0].length; i++ ) {
                for ( int j = 0; j < alumn.length; j++ ) {
                    temp += alumn[j][i];
                }
                temp2 += (temp.indexOf("0") == -1) ? "1" : "0";
                temp = "";
            }
            result += (temp2.indexOf("1") != -1) ? "yes\n" : "no\n";
            
        }
        br.close();
    }
    
}
