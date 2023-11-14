import java.util.*;

class Solution {
    public int solution(String s) {
        if(s.length() % 2 != 0) return 0;
        
        Deque<String> deque = new ArrayDeque<String>();
        Deque<String> stack = new ArrayDeque<String>();
        
        for(char ch : s.toCharArray()){
            deque.add(String.valueOf(ch));
        }
        
        int answer = 0;
        for(int i = 0; i < s.length(); i++){
            String peekFirstQ = deque.peekFirst();
            if(peekFirstQ.equals(")") || peekFirstQ.equals("}") || peekFirstQ.equals("]")){
                deque.addLast(deque.pollFirst());
                continue;
            }
            
            stack.addAll(deque);
            int small = 0;
            int middle = 0;
            int big = 0;
            Deque<String> lastStr = new ArrayDeque<String>();
            while(!stack.isEmpty()){
                String peekFirstS = stack.poll();
                if(peekFirstS.equals("(") || peekFirstS.equals("{") || peekFirstS.equals("[")){
                    if(peekFirstS.equals("(")) small  += 1;
                    if(peekFirstS.equals("{")) middle += 1;
                    if(peekFirstS.equals("[")) big    += 1;
                    lastStr.add(peekFirstS);
                } else {
                    if(peekFirstS.equals(")")) {
                        if(small == 0 || !lastStr.peekLast().equals("(")){
                            continue;
                        }
                        small -= 1;
                    }
                    
                    if(peekFirstS.equals("}")){
                        if(middle == 0 || !lastStr.peekLast().equals("{")){
                            continue;
                        }
                        middle -= 1;
                    }
                    
                    if(peekFirstS.equals("]")){
                        if(big == 0 || !lastStr.peekLast().equals("[")){
                            continue;
                        }
                        big -= 1;
                    }
                    lastStr.pollLast();
                }
            }
            if(small == 0 && middle == 0 && big == 0){
                answer += 1;
            }
            
            deque.addLast(deque.pollFirst());
            stack.clear();
        }
        return answer;
    }
}