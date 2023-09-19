package BOJ.javaAlgo.Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;
// 230918 CT BOJ S4 28278:스택2
public class boj28278{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		Stack<Integer> intStack = new Stack<Integer>();
		for(int i = 0; i < N; i++){
			StringTokenizer st = new StringTokenizer(br.readLine());
			int order = Integer.parseInt(st.nextToken());
			switch(order){
				case 1:
					intStack.push(Integer.parseInt(st.nextToken()));
					break;
				case 2:
					if(intStack.isEmpty()) {
						sb.append(-1).append("\n");
						break;
					}
					
					int num = intStack.peek();
					intStack.pop();
					sb.append(num).append("\n");
					
					break;
				case 3:
					sb.append(intStack.size()).append("\n");
					break;
				case 4:
					sb.append(intStack.isEmpty() ? 1 : 0).append("\n");
					break;
				case 5:
					sb.append(intStack.isEmpty() ? -1 : intStack.peek()).append("\n");
					break;
			}
		}
		System.out.println(sb.toString());
	}
}