package programmers.lv0;

public class pr181901 {
    public int[] solution(int n, int k) {
        int[] answer = new int[n/k];
        int num = 0;
        for(int i = k; i <= n; i += k){
            answer[num++] = i;
        }
        return answer;
    }

    public static void main(String[] args) {
        pr181901 p = new pr181901();
        System.out.println(p.solution(10, 3));
        System.out.println(p.solution(15, 5));
    }
}
