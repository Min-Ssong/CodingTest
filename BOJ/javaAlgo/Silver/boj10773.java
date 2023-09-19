package BOJ.javaAlgo.Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

// 230918 CT BOJ S4 10773:제로
public class boj10773{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int k = Integer.parseInt(br.readLine());
		int sum = 0;
		Stack<Integer> stack = new Stack<>();
		for(int i = 0; i < k; i++){
			int num = Integer.parseInt(br.readLine());
			if(num == 0){
				if(!stack.isEmpty()){
					sum -= stack.peek();
					stack.pop();
					continue;
				}
				continue;
			}
			
			sum += num;
			stack.push(num);
		}
		System.out.println(sum);
	}
}