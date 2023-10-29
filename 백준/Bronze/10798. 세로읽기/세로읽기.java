import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String[][] result = new String[5][15];
		for(int i = 0; i < result.length; i++){
			for(int j = 0; j < result[i].length; j++){
				result[i][j] = "";
			}
		}
		
		for(int i = 0; i < result.length; i++){
			StringTokenizer st = new StringTokenizer(br.readLine());
			String[] splitArr = st.nextToken().split("");
			for(int j = 0; j < splitArr.length; j++){
				result[i][j] = splitArr[j];
			}
		}
		
		for(int i = 0; i < result[0].length; i++){
			for(int j = 0; j < result.length; j++){
				if(!"".equals(result[j][i])){
					sb.append(result[j][i]);
				}
			}
		}
		System.out.println(sb);
		br.close();
	}
}