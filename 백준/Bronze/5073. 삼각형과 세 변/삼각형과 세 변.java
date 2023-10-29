import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception{
        
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		while(true){
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			if(a == 0 && a == b && b == c && a == c) break;
			
			if(a + b > c && a + c > b && b + c > a){
				if(a == b && b == c && a == c){
					sb.append("Equilateral").append("\n");
				} else if(a == b || b == c || a == c){
					sb.append("Isosceles").append("\n");
				} else if(a != b && b != c && a != c) {
					sb.append("Scalene").append("\n");
				}
			} else {
				sb.append("Invalid").append("\n");
			}
		}
		System.out.println(sb);
    }
}