import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String resultStr = "";
        for( int i = 0; i < str.length(); i++ ) {
            String tempStr = str.substring(i, i+1);
            int tempHashCode = tempStr.hashCode();
            if( tempHashCode >= 65 && tempHashCode <= 90 ){
                resultStr += tempStr.toLowerCase();
            } else if( tempHashCode >= 97 && tempHashCode <= 122) {
                resultStr += tempStr.toUpperCase();
            }
        }

        System.out.print(resultStr);
        
        sc.close();
    }
}
