import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        float result = 0;

        if( str.length() < 2 ){
            result += 0;
        } else {
            String firstChar = str.substring(0, 1);
            String secondChar = str.substring(1, 2);
            if(firstChar.equals("A")) {
                result += 4;
            }else if ( firstChar.equals("B") ) {
                result += 3;
            }else if ( firstChar.equals("C") ) {
                result += 2;
            }else if ( firstChar.equals("D") ) {
                result += 1;
            }

            if( secondChar.equals("+") ) {
                result += 0.3;
            } else if( secondChar.equals("-") ) {
                result -= 0.3;
            }
        }

        System.out.printf("%.1f", result);

        sc.close();
    }
}