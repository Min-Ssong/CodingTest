import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<String> stack = new Stack<String>();
        
        String[] str = br.readLine().split("");
        int len = 0;
        for(int i = 0; i < str.length; i++){
            if("(".equals(str[i])){
                stack.add(str[i]);
            }
            
            if(")".equals(str[i])){
                stack.pop();
                
                if("(".equals(str[i-1])){
                    len += stack.size();
                } else {
                    len += 1;
                }
            }
        }
        System.out.println(len);
        br.close();
    }
}