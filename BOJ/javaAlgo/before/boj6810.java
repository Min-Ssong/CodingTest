package BOJ.javaAlgo.before;

import java.util.Scanner;

public class boj6810 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int result = sc.nextInt() + (sc.nextInt() * 3) + sc.nextInt();
        System.out.printf("The 1-3-sum is %d", result + 91);
        sc.close();
    }    
}
