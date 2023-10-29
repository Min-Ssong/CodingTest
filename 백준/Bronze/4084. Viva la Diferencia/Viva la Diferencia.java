import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String result = "";
        while ( true ) {
            String ABCD = br.readLine();
            int A = Integer.parseInt(ABCD.split(" ")[0]);
            int B = Integer.parseInt(ABCD.split(" ")[1]);
            int C = Integer.parseInt(ABCD.split(" ")[2]);
            int D = Integer.parseInt(ABCD.split(" ")[3]);
            if ( A == 0 && B == 0 && C == 0 && D == 0 ) {
                System.out.print(result);
                break;
            } else {
                int count = 0;
                while ( true ) { 
                    int temp = A;
                    A = Math.abs(A - B);
                    B = Math.abs(B - C);
                    C = Math.abs(C - D);
                    D = Math.abs(D - temp);
                    
                    if ( A == B && B == C && C == D && D == A ) {
                        result += (count < 1) ? count + "\n" : ( count + 1 ) + "\n";
                        break;
                    }

                    count += 1;
                }
            }
        }
        br.close();
    }
}
