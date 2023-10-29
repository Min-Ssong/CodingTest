import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();
		int N = Integer.parseInt(br.readLine());
		
		Map<Integer, Integer> sMap = new HashMap<Integer, Integer>();
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) sMap.put(Integer.parseInt(st.nextToken()), 1);
		
		int M = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < M; i++) {
			int num = Integer.parseInt(st.nextToken());
			sb.append(sMap.containsKey(num) ? "1" : "0").append(" ");
		}
		System.out.println(sb.toString());
    }
}