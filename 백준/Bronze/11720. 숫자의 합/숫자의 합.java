import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        char[] charArray = br.readLine().toCharArray();
        int sum = 0;
        for (char c : charArray) {
            sum += Character.getNumericValue(c);
        }
        System.out.println(sum);
    }
}