import java.io.*;
import java.util.*;

// 230919 CT BOJ B1 1924:2007년
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        
        String[] days = {"MON","TUE","WED","THU","FRI","SAT","SUN"};
        int[] months= {0,31,28,31,30,31,30,31,31,30,31,30,31};
        
        int sum= 0;
        for(int i= 0; i < x; i++){
            sum += months[i];
        }
        
        sum += y - 1;
        System.out.println(days[sum % 7]);
    }
}