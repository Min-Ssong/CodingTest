import java.util.*;
public class Solution {
    public static String solution(String[] cards1, String[] cards2, String[] goal){
        Deque<String> stack1 = new ArrayDeque<String>();
        Deque<String> stack2 = new ArrayDeque<String>();
        for(int i = 0; i < cards1.length; i++) stack1.add(cards1[i]);
        for(int i = 0; i < cards2.length; i++) stack2.add(cards2[i]);
        for(int i = 0; i < goal.length; i++){
            if(goal[i].equals(stack1.peek())){
                stack1.poll();
            } else if(goal[i].equals(stack2.peek())){
                stack2.poll();
            } else {
                return "No";
            }
        }
        
        return "Yes";
    }
    
}