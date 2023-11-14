import java.util.*;
class Solution {
    public int solution(int[] priorities, int location) {
        PriorityQueue<Integer> prQueue= new PriorityQueue<Integer>(Collections.reverseOrder());
        
        for(int i = 0; i < priorities.length; i++){
            prQueue.offer(priorities[i]);
        }
        int answer = 0;
        while(!prQueue.isEmpty()){
            for(int i= 0; i < priorities.length; i++){
                if(priorities[i]== prQueue.peek()){
                    prQueue.poll();
                    answer += 1;
                    if(i == location){
                        return answer;
                    }
                }
            }
        }
        return answer;
    }
}