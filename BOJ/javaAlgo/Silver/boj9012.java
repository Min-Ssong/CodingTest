package BOJ.javaAlgo.Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

// 230918 CT BOJ S4 9012:괄호
public class boj9012{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		Stack<Character> stack = new Stack<Character>();
		for(int i = 0; i < T; i++){
			StringTokenizer st = new StringTokenizer(br.readLine());
			String strOrVPS = st.nextToken();
			for(int j = 0; j < strOrVPS.length(); j++){
				char ch = strOrVPS.charAt(j);
				if(ch == ')') {
					if(stack.isEmpty()){
						stack.push(ch);
						break;
					}
					
					if(stack.peek() == '('){
						stack.pop();
						continue;
					}
				}
				stack.push(ch);
			}
			sb.append(stack.size() == 0 ? "YES" : "NO").append("\n"); 
			stack.clear();
		}
		System.out.println(sb.toString());
	}
}