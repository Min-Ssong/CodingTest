public class Solution{
    public static String solution(int[] food){
        StringBuilder sb = new StringBuilder();
        int n = 0;
        String s = "";
        for(int i = 1; i < food.length; i++){
            n = food[i] / 2;
            s = String.valueOf(i);
            sb.append(repeat(n, s));
        }
        return sb.toString()+"0"+sb.reverse();
    }
    
    public static String repeat(int n, String s){
        String str = "";
        for(int i = 0; i < n; i++){
            str += s;
        }
        return str;
    }
}