package programmers.none;

public class pr20 {
    public static void main(String[] args) {
        int n = 7;
        String answer = "수박".repeat(n/2);
        answer += ( n % 2 == 0 ) ? "" : "수";
        System.out.println(answer);
    }
}
