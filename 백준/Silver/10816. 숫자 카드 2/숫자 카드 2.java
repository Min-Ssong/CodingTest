import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		
		Map<String, Integer> tempMap = new HashMap<String, Integer>();
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++){
			String num = st.nextToken();
			if(!tempMap.containsKey(num)){
				tempMap.put(num, 1);
			} else {
				tempMap.put(num, tempMap.get(num) + 1);
			}
		}
		
		int M = Integer.parseInt(br.readLine());
		StringTokenizer st2 = new StringTokenizer(br.readLine());
		for(int i = 0; i < M; i++){
			String num = st2.nextToken();
			if(tempMap.containsKey(num))
				sb.append(tempMap.get(num)).append(" ");
			else 
				sb.append("0").append(" ");
		}
		System.out.println(sb);
    }
}
