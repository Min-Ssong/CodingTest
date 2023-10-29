import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 1;
        String result = "";
        while ( sc.hasNext() ){
            String temp = sc.nextLine();
            if ( temp.length() != 1 ){
                result += "Case " + i + ": Sorting... done!\n";
            } else {
                break;
            }
            i += 1;
        }
        System.out.print(result);
        sc.close();
    }
}
