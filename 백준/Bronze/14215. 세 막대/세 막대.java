import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String nums = br.readLine();
        String[] num = nums.split(" ");
        int[] numInt = {Integer.parseInt(num[0]),
            Integer.parseInt(num[1]),
            Integer.parseInt(num[2])};
        Arrays.sort(numInt);
        
        int temp = numInt[0] + numInt[1];
        System.out.println(( temp <= numInt[2] ) ? temp * 2 - 1 : temp + numInt[2]);
        br.close();
    }
}
