import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int count = st.countTokens();
        int num = 0;
        for(int i = 0; i < count; i++){
            num += Integer.parseInt(st.nextToken()) * 5;
        }
        System.out.println(num);
        br.close();
    }
}