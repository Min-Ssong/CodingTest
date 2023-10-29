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
			int temp = box[a];
			box[a] = box[b];
			box[b] = temp;
		}
		for(int j : box){
			System.out.print(j + " ");
		}
		br.close();
	}
}