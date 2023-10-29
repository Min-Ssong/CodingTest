import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String AB = br.readLine();
        String CD = br.readLine();
        int A = Integer.parseInt(AB.split(" ")[0]);
        int B = Integer.parseInt(AB.split(" ")[1]);
        int C = Integer.parseInt(CD.split(" ")[0]);
        int D = Integer.parseInt(CD.split(" ")[1]);

        if ( B+C > A+D ) {
            System.out.print(A+D);
        } else if ( B+C < A+D ) {
            System.out.print(B+C);
        } else {
            System.out.print(B+C);
        }

        br.close();
    }
}
