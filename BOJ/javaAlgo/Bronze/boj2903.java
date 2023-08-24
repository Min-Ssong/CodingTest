package BOJ.javaAlgo.Bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class boj2903 {
    public class Main {
        public static void main(String[] args) throws Exception{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int len = Integer.parseInt(br.readLine());
            int hPoint = 2;
            for(int i = 0; i < len; i++){
                hPoint = hPoint * 2 - 1;
            }
            System.out.println((int)Math.pow(hPoint, 2));
        }
    }
}
