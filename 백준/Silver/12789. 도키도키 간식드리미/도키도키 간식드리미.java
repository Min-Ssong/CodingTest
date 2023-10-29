import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        Queue<Integer> queue = new LinkedList<>();
        Stack<Integer> stack = new Stack<>();
        
        for (int i = 0; i < N; i++) {
            queue.add(sc.nextInt());
        }

        int current = 1;
        while (current <= N) {
            if (!queue.isEmpty() && queue.peek() == current) {
                queue.poll();
                current++;
            } else if (!stack.isEmpty() && stack.peek() == current) {
                stack.pop();
                current++;
            } else if (!queue.isEmpty()) {
                stack.push(queue.poll());
            } else {
                System.out.println("Sad");
                return;
            }
        }
        
        if (stack.isEmpty()) {
            System.out.println("Nice");
        } else {
            System.out.println("Sad");
        }
    }
}
