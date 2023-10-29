import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        for( int j = 97; j < 123; j++ ){
            System.out.printf("%d ", str.indexOf((char)j));
        }
        
        sc.close();
    }
}
