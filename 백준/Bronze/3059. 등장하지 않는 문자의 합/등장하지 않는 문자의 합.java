import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        for ( int i = 0; i < T; i++ ) {
            String s = br.readLine();
            int[] alphabet = new int[26];
            for ( int j = 0; j < s.length(); j++ ) {
                alphabet[(int)s.charAt(j) - 65] += 1;
            }

            int num = 0;
            for ( int k = 0; k < alphabet.length; k++ ) {
                if ( alphabet[k] == 0 ) {
                    num += k + 65;
                }
            }
            sb.append(num).append("\n");
        }
        System.out.print(sb);
        br.close();
    }
}