import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String allInput = br.readLine();
        int S = Integer.parseInt(allInput.split(" ")[0]);
        int K = Integer.parseInt(allInput.split(" ")[1]);
        int H = Integer.parseInt(allInput.split(" ")[2]);
        int num = S + K + H;
        if ( num >= 100 ) {
            System.out.print("OK");
        } else {
            if ( S < K && S < H ) {
                System.out.print("Soongsil");
            } else if ( K < S && K < H ) {
                System.out.print("Korea");
            } else if ( H < K && H < S ) {
                System.out.print("Hanyang");
            }
        }
        br.close();
    }
}
