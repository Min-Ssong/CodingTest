import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String inputStr = br.readLine();
        int sum = 0;
        for(char inputChar : inputStr.toCharArray()){
            sum += inputChar - '0';
        }
        System.out.println(sum);
        br.close();
    }
}
