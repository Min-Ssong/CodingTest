import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        String ab = String.valueOf(a) + String.valueOf(b);
        String cc = String.valueOf(c);
        System.out.println(a + b - c);
        System.out.println(Integer.parseInt(ab) - Integer.parseInt(cc));
    }
}