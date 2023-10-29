import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();
        String result = ":fan::fan::fan:\n" 
            + ":fan::" + name + "::fan:\n"
            + ":fan::fan::fan:";
        System.out.print(result);
        br.close();
    }
}
