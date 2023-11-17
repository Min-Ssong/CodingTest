public class Solution{
    public static int solution(int n, int m, int[] section){
        if(m == 1) return section.length;
        int bootChill = 0;
        int cur = 0;
        for(int i = 0; i < section.length; i++){
            if(cur >= section[i]) continue;
            cur = section[i] + m - 1;
            bootChill += 1;
        }
        return bootChill;
    }
}