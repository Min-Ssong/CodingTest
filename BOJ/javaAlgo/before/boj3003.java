package BOJ.javaAlgo.before;

import java.util.Scanner;

public class boj3003{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int[] standard = {1, 1, 2, 2, 2, 8};
        int[] result = new int[standard.length];
        for( int i = 0; i < standard.length; i++ ) {
            int num = Integer.parseInt(str.trim().split(" ")[i]);
            result[i] = standard[i] - num;
        }
        
        for (int i : result) {
            System.out.printf("%d ", i);
        }
        sc.close();
    }
}