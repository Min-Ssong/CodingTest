package programmers;
public class pr181901_0 {
    public int[] solution(int n, int k) {
        int[] answer = new int[n/k];
        int num = 0;
        for(int i = k; i <= n; i += k){
            answer[num++] = i;
        }
        return answer;
    }

    public static void main(String[] args) {
        pr181901_0 p = new pr181901_0();
        System.out.println(p.solution(10, 3));
        System.out.println(p.solution(15, 5));
    }
}
