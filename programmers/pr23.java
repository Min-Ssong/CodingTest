package programmers;

public class pr23 {
    public static void main(String[] args) {
        String s = "-1 -1";
        String[] temp = s.split(" ");
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (String str : temp) {
            int num = Integer.parseInt(str);
            max = Math.max(num, max);
            min = Math.min(num, min);
        }

        System.out.printf("%d %d", min, max);
    }
}
