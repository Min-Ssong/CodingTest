import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int height = sc.nextInt();
        int b = sc.nextInt();
        String temp = "";
        for ( int i = 0; i < height; i++ ) {
            while ( sc.hasNext() ) {
                StringBuilder sb = new StringBuilder(sc.next());
                temp += sb.reverse() + "\n";
            }
        }
        System.out.print(temp);
        
        sc.close();
    }
}
