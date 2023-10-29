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
			int n = Integer.parseInt(br.readLine());
			if(n == -1) break;
			
			// 약수 추출 부분
			ArrayList<Integer> arr = new ArrayList<Integer>();
			arr.add(1);
			for(int i = 2; i < n; i++){
				if(n % i == 0){
					arr.add(i);
				}
			}
			
			// 완전 수 체크 및 출력문
			int result = 0;
			for (Integer integer : arr) {
				result += integer;
			}
			
			String msg = "";
			if(result == n){
				msg = n + " = 1 + ";
				for(int i = 1; i < arr.size(); i++){
					if(i == arr.size() - 1){
						msg += Integer.toString(arr.get(i));
					} else {
						msg += Integer.toString(arr.get(i)) + " + ";
					}
				}
			} else {
				msg = n + " is NOT perfect.";
			}
			sb.append(msg).append("\n");
			
		}
		System.out.println(sb);
    }
}