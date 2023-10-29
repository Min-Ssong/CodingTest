import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] originStr = sc.nextLine().trim().split(" ");
        long N = Long.parseLong(originStr[0]);
        long M = Long.parseLong(originStr[1]);

        System.out.print(Math.abs(N-M));
        sc.close();
    }
}