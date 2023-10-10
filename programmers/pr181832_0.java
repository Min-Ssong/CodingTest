package programmers;
public class pr181832_0 {
    class Solution {
        public int[][] solution(int n) {
            int[][] result = new int[n][n];
            int number = 1;
            int x = 0, y = 0;
    
            for (int i = 0; i < (n + 1) / 2; i++) {
                int length = n - 2 * i;
                for (int j = 0; j < length - 1 && y < n; j++) { result[x][y++] = number++; }
                for (int j = 0; j < length - 1 && x < n; j++) { result[x++][y] = number++; }
                for (int j = 0; j < length - 1 && y >= 0; j++) { result[x][y--] = number++; }
                for (int j = 0; j < length - 1 && x >= 0; j++) { result[x--][y] = number++; }
    
                x++;
                y++;
            }
    
            if (n % 2 != 0) {
                result[n / 2][n / 2] = number;
            }
    
            return result;
        }
    }    
}
