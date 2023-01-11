package BOJ.javaAlgo.before;

import java.io.*;

public class boj1085 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String coors = br.readLine();
        int x = Integer.parseInt(coors.split(" ")[0]);
        int y = Integer.parseInt(coors.split(" ")[1]);
        int w = Integer.parseInt(coors.split(" ")[2]);
        int h = Integer.parseInt(coors.split(" ")[3]);
        int result = Integer.min(Integer.min(x, y), Integer.min(Math.abs(w-x), Math.abs(h-y)));
        System.out.print(result);
        br.close();
    }
}