import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String result = "";
        for ( int i = 0; i < N; i++ ) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            if ( A <= B ) {
                result += "Data Set " + ( i + 1 ) + ":\nno drought\n\n";
            } else if ( Math.pow(5, 1) * B >= A ) {
                result += "Data Set " + ( i + 1 ) + ":\ndrought\n\n";
            } else {
                int j = 2;
                while ( true ) {
                    double pow = Math.pow(5, j) * B;
                    String repeatMega = "mega ".repeat(j-1);
                    if ( pow >= A ) {
                        result += 
                            "Data Set " + ( i + 1 ) + ":\n" + repeatMega + "drought\n\n";
                        break;
                    }
                    j += 1;
                }
            }
        }
        System.out.print(result);
        br.close();
    }
}
