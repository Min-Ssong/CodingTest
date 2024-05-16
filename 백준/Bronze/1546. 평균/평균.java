import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] inputNumArray = br.readLine().split(" ");
        int max = 0;
        int sum = 0;
        for(int i = 0; i < inputNumArray.length; i++){
            sum += Integer.parseInt(inputNumArray[i]);
            max = Integer.max(max, Integer.parseInt(inputNumArray[i]));
        }

        System.out.println( sum * 100.0 / max / N );
        br.close();
    }
}
