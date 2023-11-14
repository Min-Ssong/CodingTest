import java.util.Arrays;
class Solution {
    public long solution(long n) {
        String[] temp = String.valueOf(n).split("");
        Arrays.sort(temp);
        StringBuilder sb = new StringBuilder();
        for (String str : temp) {
            sb.append(str);
        }
        return Long.parseLong(sb.reverse().toString());
    }
}