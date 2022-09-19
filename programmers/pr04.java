package programmers;

public class pr04 {
    public static void main(String[] args) {
        int[] n = {5,5};
        double answer = 0;
        for (int i : n) {
            answer += i;
        }
        System.out.println(answer / n.length);
    }
}
