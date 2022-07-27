package BOJ.javaAlgo;

import java.util.Scanner;

public class boj10807 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int intLenth = Integer.parseInt(sc.nextLine());
        String[] numbers = sc.nextLine().split(" ");
        int findInt = Integer.parseInt(sc.nextLine());
        int count = 0;

        for( int i = 0; i < intLenth; i++ ) {
            if(findInt == Integer.parseInt(numbers[i])){
                count = count + 1;
            }
        }

        System.out.print(count);

        sc.close();
    }
}