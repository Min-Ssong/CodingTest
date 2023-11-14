import java.util.*;
class Solution
{
    public int solution(int []a, int []b)
    {
        Arrays.sort(a);
        Arrays.sort(b);
        int answer = 0;
        for ( int i = 0; i < a.length; i++ ) {
            answer += a[i] * b[(b.length - 1) - i];
        }

        return answer;
    }
}