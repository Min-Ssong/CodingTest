import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String nums = br.readLine();
        int A = Integer.parseInt(nums.split(" ")[0]);
        Double B = Double.parseDouble(nums.split(" ")[1]);
        if ( A == 0 || B == 0 ) {
            System.out.print("1");
        } else {
            System.out.print(A - (A * B) / 100 >= 100 ? "0" : "1");
        }
        br.close();
    }
}
