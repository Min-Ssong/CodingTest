import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String rl = "";
        while( (rl = br.readLine()) != null ) {
            String name = rl.split(" ")[0];
            int age = Integer.parseInt(rl.split(" ")[1]);
            int wight = Integer.parseInt(rl.split(" ")[2]);

            if ( name.equals("#") ) {
                break;
            } else {
                if ( age > 17 || wight >= 80 ) {
                    bw.write(name + " Senior\n");
                } else {
                    bw.write(name + " Junior\n");
                }
            }
        }

        bw.flush();
        br.close();
        bw.close();
    }
}