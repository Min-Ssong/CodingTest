import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

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