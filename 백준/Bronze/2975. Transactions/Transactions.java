import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String result = "";
        while ( true ) {
            String allInput = br.readLine();
            if ( allInput.equals("0 W 0") ) {
                System.out.print(result);
                break;
            }

            int A = Integer.parseInt(allInput.split(" ")[0]);
            int B = Integer.parseInt(allInput.split(" ")[2]);
            String kind = allInput.split(" ")[1];
            if ( kind.equals("W") ) {
                result += (A - B < -200) ? "Not allowed\n" : String.valueOf(A - B) + "\n";
            } else {
                result += String.valueOf(A + B) + "\n";
            }
        }
        br.close();
    }
}
