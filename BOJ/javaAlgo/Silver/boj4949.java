package BOJ.javaAlgo.Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

// 230918 CT BOJ S4 4949:균형잡힌 세상
public class boj4949{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		Stack<String> stack = new Stack<String>();
		while(true){
			String lines = br.readLine();
			if(lines.length() == 1) break;
			
			String[] line = lines.split("");
			for(int i = 0; i < line.length; i++){
				String str = line[i];
				if(str.equals(".")) break;
				
				if(str.equals("(") || str.equals("[")) stack.push(str);
				
				if(str.equals(")") || str.equals("]")){
					if(stack.isEmpty()){
						stack.push(str);
						break;
					}
					
					String diff = stack.peek();
					if(diff.equals("(") && str.equals(")")){
						stack.pop();
						continue;
					}
					
					if(diff.equals("[") && str.equals("]")){
						stack.pop();
						continue;
					}
					stack.push(str);
				}
			}
			sb.append(stack.size() == 0 ? "yes" : "no").append("\n");
			stack.clear();
		}
		
		System.out.println(sb.toString());
	}
}