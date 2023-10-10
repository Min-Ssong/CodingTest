package programmers;
public class pr120866_0 {
    class Solution {
        public int solution(int[][] board) {
            int n = board.length;
            int[] dx = {-1, -1, -1, 0, 0, 1, 1, 1};
            int[] dy = {-1, 0, 1, -1, 1, -1, 0, 1};
    
            for(int i = 0; i < n; i++){
                for(int j = 0; j < n; j++){
                    if(board[i][j] == 1){
                        for(int k = 0; k < 8; k++){
                            int newX = i + dx[k];
                            int newY = j + dy[k];
                            if(newX >= 0 && newX < n && newY >= 0 && newY < n && board[newX][newY] == 0){
                                board[newX][newY] = -1;
                            }
                        }
                    }
                }
            }
    
            int answer = 0;
            for(int i = 0; i < n; i++){
                for(int j = 0; j < n; j++){
                    if(board[i][j] == 0) answer++;
                }
            }
    
            return answer;
        }
    }    
}
