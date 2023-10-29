import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int num = 1;
		for(int i = 0; i < str.length(); i++){
			if(str.charAt(i) != str.charAt(str.length() - i - 1)){
				num = 0;
				break;
			}
		}
		System.out.println(num);
		br.close();
	}
}