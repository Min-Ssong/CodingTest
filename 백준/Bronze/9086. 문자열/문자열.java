import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        for( int i = 0; i < len; i++ ){
            String str = sc.next();
            String startStr = String.valueOf(str.charAt(0));
            String endStr =   String.valueOf(str.charAt(str.length()-1));
            System.out.println(startStr + endStr);
        }
        sc.close();
    }
}