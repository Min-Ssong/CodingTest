package BOJ.javaAlgo.before;

import java.util.*;

public class boj2920 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int[] asc = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] desc = {8, 7, 6, 5, 4, 3, 2, 1};
        int[] splitInt = new int[8];
        for( int i = 0; i < 8; i++ ) {
            splitInt[i] = Integer.parseInt(str.trim().split(" ")[i]);
        }
        
        if( Arrays.equals(splitInt, asc) ) {
            System.out.println("ascending");
        }else if( Arrays.equals(splitInt, desc) ) {
            System.out.println("descending");
        }else{
            System.out.println("mixed");
        }
        
        sc.close();
    }
}
