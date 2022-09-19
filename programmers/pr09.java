package programmers;

public class pr09 {
    public static void main(String[] args) {
        String s = "ohhpyoppyo";
        String[] temp = s.toUpperCase().split("");
        int count = 0;
        for (String str : temp) {
            if ( "Y".equals(str) ) {
                count += 1;
            } else if ( "P".equals(str) ) {
                count -= 1;
            }
        }
        System.out.println( count == 0 ? true : false );
    }
}
