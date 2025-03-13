import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        String[] aa = br.readLine().split("");
        int addNubmer = 0;
        for (String numStr : aa) {
            addNubmer += Integer.parseInt(numStr);
        }
        System.out.println(addNubmer);
    }
}