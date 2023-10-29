import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String strXywh = br.readLine();
        int x = Integer.parseInt(strXywh.split(" ")[0]);
        int y = Integer.parseInt(strXywh.split(" ")[1]);
        int w = Integer.parseInt(strXywh.split(" ")[2]);
        int h = Integer.parseInt(strXywh.split(" ")[3]);

        System.out.println(Integer.min(Integer.min(w-x, h-y), Integer.min(x, y)));
        br.close();
    }
}
