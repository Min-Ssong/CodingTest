import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        double result = Math.floor(Math.pow(a, 2) - Math.pow(b, 2));
        DecimalFormat format = new DecimalFormat("0.#");
        System.out.println(format.format(result));
        
        sc.close();
    }
}
