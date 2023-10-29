import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
  // 10810: 공넣기
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		int m = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());
		int[] box = new int[m];
		for(int i = 0; i < m; i++){
			box[i] = i+1;
		}
		
		for(int i = 0; i < n; i++){
			StringTokenizer st1 = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st1.nextToken())-1;
			int b = Integer.parseInt(st1.nextToken())-1;
			
			for(int j = a; j <= (a+b)/2; j++){
				int temp = box[j];
				box[j] = box[a+b-j];
				box[a+b-j] = temp;
			}
		}
		for(int i : box){
			sb.append(i).append(" ");
		}
		System.out.println(sb);
		br.close();
	}
}