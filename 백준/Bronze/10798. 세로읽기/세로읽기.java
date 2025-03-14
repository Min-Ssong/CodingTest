import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[][] grid = new char[5][15];
        
        for(int i = 0; i < grid.length; i++){
            char[] words = br.readLine().toCharArray();
            for(int j = 0; j < words.length; j++){
                grid[i][j] = words[j];
            }
        }
        
        StringBuilder resultWord = new StringBuilder();
        for(int i = 0; i < grid[0].length; i++){
            for(int j = 0; j < grid.length; j++){
                if( grid[j][i] != '\u0000' ) resultWord.append(grid[j][i]);
            }
        }
        
        System.out.println(resultWord.toString());
    }
}