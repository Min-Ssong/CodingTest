import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.nextLine();
        String c = sc.nextLine();
        int b_0 = Integer.parseInt(c.trim().split(" ")[0]) - Integer.parseInt(a.trim().split(" ")[2]);
        int b_1 = Integer.parseInt(c.trim().split(" ")[1]) / Integer.parseInt(a.trim().split(" ")[1]);
        int b_2 = Integer.parseInt(c.trim().split(" ")[2]) - Integer.parseInt(a.trim().split(" ")[0]);
        System.out.printf("%d %d %d", b_0, b_1, b_2);

        sc.close();
    }    
}
