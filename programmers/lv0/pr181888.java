package programmers.lv0;

class pr181888 {
    public int[] solution(int[] num_list, int n) {
        int len = (num_list.length % n == 0) ? num_list.length / n : num_list.length / n + 1;
        int[] answer = new int[len];
        int num = 0;
        for(int i = 0; i < num_list.length; i++){
            if(i % n == 0){
                answer[num++] = num_list[i];
            }
        }
        return answer;
    }
    public void printArray(int[] num_list){
        for (int i : num_list) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        pr181888 p = new pr181888();
        p.printArray(p.solution(new int[]{4, 2, 6, 1, 7, 6}, 2));
        p.printArray(p.solution(new int[]{4, 2, 6, 1, 7, 6}, 4));
    }
}