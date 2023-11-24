import java.util.*;

public class Solution {
    public static int solution(String[][] board, int h, int w){
        String main = board[h][w];
        int answer = 0;
        answer += (h != 0 && main.equals(board[h-1][w])) ? 1 : 0;
        answer += (w != 0 && main.equals(board[h][w-1])) ? 1 : 0;
        answer += (w < board[0].length-1 && main.equals(board[h][w+1])) ? 1 : 0;
        answer += (h < board.length-1 && main.equals(board[h+1][w])) ? 1 : 0;
        return answer;
    }
    
}