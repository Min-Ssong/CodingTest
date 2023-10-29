import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String result = "";
        int len = Integer.parseInt(br.readLine());

        for ( int i = 0; i < len; i++ ) {
            String inputs = br.readLine();
            float A = Float.parseFloat(inputs.split(" ")[1]);
            float B = Float.parseFloat(inputs.split(" ")[2]);
            float C = Float.parseFloat(inputs.split(" ")[3]);
            int sum = Math.round(A + B + C);
            if ( A >= 10.5 && B >= 7.5 && C >= 12 && sum >= 55) {
                result += inputs.split(" ")[0] + " " + sum + " PASS\n";
            } else {
                result += inputs.split(" ")[0] + " " + sum + " FAIL\n";
            }
        }

        System.out.print(result);
        br.close();
    }
}