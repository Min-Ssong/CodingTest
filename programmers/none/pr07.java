package programmers.none;

import java.util.Arrays;

public class pr07 {
    public static void main(String[] args) {
        long n = 118372L;
        String[] temp = String.valueOf(n).split("");
        Arrays.sort(temp);
        StringBuilder sb = new StringBuilder();
        for (String str : temp) {
            sb.append(str);
        }
        System.out.println(Long.parseLong(sb.reverse().toString()));
    }
}