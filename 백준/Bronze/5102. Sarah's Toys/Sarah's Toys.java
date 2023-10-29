import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String result = "";
        while ( true ) {
            String dolls = br.readLine();
            if ( dolls.equals("0 0") ) {
                System.out.print(result);
                break;
            }
            int doll = Integer.parseInt(dolls.split(" ")[0]) - Integer.parseInt(dolls.split(" ")[1]);
            if ( doll <= 1) {
                result += "0 0\n";
            } else {
                if ( doll % 2 != 0 ) {
                    int share = (doll / 2) - 1;
                    result += share + " 1\n";
                } else {
                    result += doll / 2 + " 0\n";
                }
            }
        }
        br.close();
    }
}
