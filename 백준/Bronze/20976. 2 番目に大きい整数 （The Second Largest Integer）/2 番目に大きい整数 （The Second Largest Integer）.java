import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int[] num = {
            Integer.parseInt(input.split(" ")[0]),
            Integer.parseInt(input.split(" ")[1]),
            Integer.parseInt(input.split(" ")[2])
        };
        Arrays.sort(num);
        System.out.print(num[1]);
        br.close();
    }
}
