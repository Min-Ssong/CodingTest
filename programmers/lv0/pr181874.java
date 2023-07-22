package programmers.lv0;

public class pr181874 {
    class Solution {
        public String solution(String myString) {
            return myString.toLowerCase().replace('a', 'A');
        }
    }
    public static void main(String[] args) {
        pr181874 pr = new pr181874();
        pr.solution("abstract algebra");
    }
}
