package BOJ.javaAlgo.before;

import java.util.Scanner;

public class boj10870 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(fibo(sc.nextInt()));
        sc.close();
    }

    public static int fibo(int num){
        if( num <= 1 ){
            return num;
        } else {
            return fibo(num - 2) + fibo(num - 1);
        }
    }
}
