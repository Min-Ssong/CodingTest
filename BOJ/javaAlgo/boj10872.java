package BOJ.javaAlgo;

import java.util.Scanner;

public class boj10872 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = 1;
        for(int i = n; i > 0; i--){
            result *= i;
        }
        System.out.print(result);
        sc.close();
    }
}
