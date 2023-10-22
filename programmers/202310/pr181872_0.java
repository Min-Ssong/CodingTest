package programmers;
public class pr181872_0{
    class Solution {
        public String solution(String myString, String pat) {
            return myString.substring(0, myString.lastIndexOf(pat)+pat.length());
        }
    }
}