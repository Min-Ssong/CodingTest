package SWEA.D1;

import java.util.Scanner;

public class D1_2058 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int result = 0;
        int num = sc.nextInt();
        while ( num > 10 ) {
            result += num % 10;
            num = num / 10;
        }

        System.out.println(result + num);
        sc.close();
    }
}
