package programmers.none;

public class pr21 {
    public static void main(String[] args) {
        String s = "qwer";
        int len = s.length();
        String answer = (len % 2 == 0) 
            ? s.substring(len / 2 - 1, len / 2 + 1) 
            : s.substring(len / 2, len / 2 + 1);
        System.out.println(answer);
    }
}
