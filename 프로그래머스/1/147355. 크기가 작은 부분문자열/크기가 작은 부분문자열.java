class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        long pValue = Long.parseLong(p);
        int pLength = p.length();

        for(int i = 0; i <= t.length() - pLength; i++){
            long subValue = Long.parseLong(t.substring(i, i + pLength));
            if(pValue >= subValue){
                answer += 1;
            }
        }
        
        return answer;
    }
}
