import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int q = Integer.parseInt(br.readLine());
        String[] rule = new String[q];
        String result = "";
        for ( int i = 0; i < q; i++ ) {
            rule[i] = br.readLine();
        }

        int r = Integer.parseInt(br.readLine());
        for ( int i = 0; i < r; i++ ) {
            int num = Integer.parseInt(br.readLine());
            if ( num >= 1 && num <= q ) {
                result += "Rule " + num + ": " + rule[num-1] + "\n";
            } else {
                result += "Rule " + num + ": No such rule\n";
            }
        }
        System.out.print(result);
        br.close();
    }
}
