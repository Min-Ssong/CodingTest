class Solution {
    public String solution(String s) {
        String[] temp = s.split(" ");
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (String str : temp) {
            int num = Integer.parseInt(str);
            max = Math.max(num, max);
            min = Math.min(num, min);
        }
        return min + " " + max;
    }
}