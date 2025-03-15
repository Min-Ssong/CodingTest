import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(Math.abs(br.readLine().charAt(0) - 'I') + 84);
    }
}