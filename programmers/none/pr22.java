package programmers.none;

public class pr22 {
    public static void main(String[] args) {
        int[] numbers = {5,8,4,0,6,7,9};
        int answer = 0;
        for ( int i = 0; i < numbers.length; i++ ) {
            for ( int j = 0; j < 10; j++ ) {
                answer += (numbers[i] == j) ? numbers[i] : 0;
            }
        }
        System.out.println(45 - answer);
    }
}