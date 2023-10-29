import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String result = "";
        int i = 1;
        while ( true ) {
            int N = Integer.parseInt(br.readLine());
            if ( N == 0 ) {
                System.out.print(result);
                break;
            }
            int N2 = 0;
            if ( (3 * N) % 2 == 0 ) {
                N2 = (3 * N) / 2;
                result += i+". even " + (3 * N2) / 9 + "\n";
            } else {
                N2 = ((3 * N) + 1) / 2;
                result += i+". odd " + (3 * N2) / 9 + "\n";
            }
            i += 1;
        }
        br.close();
    }
}
