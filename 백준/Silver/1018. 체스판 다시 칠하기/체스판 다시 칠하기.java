import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        char[][] board = new char[N][M];

        for (int i = 0; i < N; i++) {
            String row = br.readLine();
            for (int j = 0; j < M; j++) {
                board[i][j] = row.charAt(j);
            }
        }

        int minChanges = Integer.MAX_VALUE;
        for (int i = 0; i <= N - 8; i++) {
            for (int j = 0; j <= M - 8; j++) {
                minChanges = Math.min(minChanges, getMinChanges(board, i, j));
            }
        }
        
        System.out.println(minChanges);
    }

    public static int getMinChanges(char[][] board, int startX, int startY) {
        char[] colors = {'W', 'B'};
        int[] changes = new int[2];

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                for (int k = 0; k < 2; k++) {
                    if (board[startX + i][startY + j] != colors[(i + j + k) % 2]) {
                        changes[k]++;
                    }
                }
            }
        }
        
        return Math.min(changes[0], changes[1]);
    }
}