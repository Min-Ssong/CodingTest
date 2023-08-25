package BOJ.javaAlgo.Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj19532 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int a = Integer.parseInt(str.split(" ")[0]);
		int b = Integer.parseInt(str.split(" ")[1]);
		int c = Integer.parseInt(str.split(" ")[2]);
		int d = Integer.parseInt(str.split(" ")[3]);
		int e = Integer.parseInt(str.split(" ")[4]);
		int f = Integer.parseInt(str.split(" ")[5]);
		
		for(int x = -999; x <= 999; x++){
			for(int y = -999; y <= 999; y++){
				if(a * x + b * y == c && d * x + e * y == f){
					System.out.println(x + " " + y);
				}
			}
		}
    }
}
