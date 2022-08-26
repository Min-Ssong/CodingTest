package BOJ.javaAlgo;

import java.util.Scanner;

public class boj21665 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nums = sc.nextLine();
        int A = Integer.parseInt(nums.split(" ")[0]);
        int B = Integer.parseInt(nums.split(" ")[1]);
        for ( int i = 0; i < A; i++ ) {
            for ( int j = 0; j < B; j++ ) {
                System.out.println(sc.nextLine());
            }
        }
        sc.close();
    }
}
