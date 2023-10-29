import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String temp = br.readLine();
        int A = Integer.parseInt(temp.split(" ")[0]);
        int B = Integer.parseInt(temp.split(" ")[1]);
        System.out.print( Math.max((A+B), (A-B)) + "\n" + Math.min((A+B), (A-B)) );
        br.close();
    }
}
