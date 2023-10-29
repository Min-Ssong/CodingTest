import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String nph = br.readLine();
        int n = Integer.parseInt(nph.split(" ")[0]);
        int beforeDoller = Integer.parseInt(nph.split(" ")[1]);
        int highDoller = Integer.parseInt(nph.split(" ")[2]);
        String result = "";
        for ( int i = 0; i < n; i++ ) {
            int preDoller = Integer.parseInt(br.readLine());
            if ( preDoller > highDoller ) {
                result += "BBTV: Dollar reached "+preDoller+" Oshloobs, A record!\n";
                highDoller = preDoller;
            } else {
              if ( preDoller < beforeDoller ) {
                result += "NTV: Dollar dropped by "+(beforeDoller - preDoller)+" Oshloobs\n";
              }
            }
            beforeDoller = preDoller;
        }
        System.out.println(result);
        br.close();
    }
}
