package programmers.none;

public class pr06 {
    public static void main(String[] args) {
        Long n = 36765L;
        String[] temp = String.valueOf(n).split("");
        int[] answer = new int[temp.length];
        for ( int i = temp.length - 1; i >= 0; i-- ) {
            answer[temp.length - 1 - i] = Integer.parseInt(temp[i]);
        }
        System.out.println(answer);
    }
}
