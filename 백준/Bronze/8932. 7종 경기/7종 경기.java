import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Double[] A = { 9.23076, 1.84523, 56.0211, 4.99087, 0.188807, 15.9803, 0.11193 };
        Double[] B = {26.7, 75.0, 1.5, 42.5, 210.0, 3.8, 254.0};
        Double[] C = { 1.835, 1.348, 1.05, 1.81, 1.41, 1.04, 1.88 };
        String[] D = {"T", "F", "F", "T", "F", "F", "T"};
        int N = Integer.parseInt(br.readLine());
        for ( int i = 0; i < N; i++ ) {
            String[] P = br.readLine().split(" ");
            int result = 0;
            for ( int j = 0; j < P.length; j++ ) {
                if ( D[j].equals("T") ) {
                    result += A[j] * Math.pow(B[j] - Integer.parseInt(P[j]), C[j]);
                } else if ( D[j].equals("F") ) {
                    result += A[j] * Math.pow(Integer.parseInt(P[j]) - B[j], C[j]);
                }
            }
            sb.append(result).append("\n");
        }
        System.out.print(sb);
        br.close();
    }
}
