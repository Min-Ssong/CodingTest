package BOJ.javaAlgo;

import java.io.*;

public class boj1085 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String coors = br.readLine();
        int[] coor = {Integer.parseInt(coors.split(" ")[0]),
            Integer.parseInt(coors.split(" ")[1]),
            Integer.parseInt(coors.split(" ")[2]),
            Integer.parseInt(coors.split(" ")[3])};
        int wx = coor[2] - coor[0];
        int hy = coor[3] - coor[1];
        System.out.println(Integer.min(wx, hy));
        br.close();
    }
}