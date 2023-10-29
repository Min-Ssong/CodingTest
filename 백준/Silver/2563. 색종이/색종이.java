import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		int[][] paper = new int[100][100];
		for(int i = 0; i < num; i++){
			StringTokenizer st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y   = Integer.parseInt(st.nextToken());
			for(int j = x; j < x + 10; j++){
				for(int k = y; k < y + 10; k++){
					paper[j][k] = 1;
				}
			}
		}
		int result = 0;
		for(int i = 0; i < paper.length; i++){
			for(int j = 0; j < paper[i].length; j++){
				result += paper[i][j] == 1 ? 1 : 0;
			}
		}
		System.out.print(result);
		br.close();
	}
}