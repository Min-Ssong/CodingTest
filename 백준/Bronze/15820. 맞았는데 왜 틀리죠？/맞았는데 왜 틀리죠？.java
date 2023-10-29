import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String NMs = br.readLine();
        int N = Integer.parseInt(NMs.split(" ")[0]);
        int M = Integer.parseInt(NMs.split(" ")[1]);
        
        boolean tc = true;
        for ( int i = 0; i < N; i++ ) {
            String nums = br.readLine();
            int num_1 = Integer.parseInt(nums.split(" ")[0]);
            int num_2 = Integer.parseInt(nums.split(" ")[1]);
            if ( num_1 != num_2 ) {
                tc = false;
            }
        }

        boolean sc = true;
        for ( int i = 0; i < M; i++ ) {
            String nums = br.readLine();
            int num_1 = Integer.parseInt(nums.split(" ")[0]);
            int num_2 = Integer.parseInt(nums.split(" ")[1]);
            if ( num_1 != num_2 ) {
                sc = false;
            }
        }
        if ( tc && sc ) {
            System.out.print("Accepted");
        } else if ( tc && !sc ) {
            System.out.print("Why Wrong!!!");
        } else {
            System.out.print("Wrong Answer");
        }
        br.close();
    }
}
