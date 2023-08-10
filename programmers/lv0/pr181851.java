class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int a = -1, b = -1, c = -1; // 상위 3명의 학생 인덱스 초기화

        for (int i = 0; i < rank.length; i++) {
            int studentIdx = -1;
            int minRank = Integer.MAX_VALUE;

            // 등수가 낮은 (즉, 더 좋은) 학생의 인덱스 찾기
            for (int j = 0; j < rank.length; j++) {
                if (attendance[j] && rank[j] < minRank && j != a && j != b && j != c) {
                    studentIdx = j;
                    minRank = rank[j];
                }
            }

            // 상위 3명의 학생 인덱스 설정
            if (a == -1) {
                a = studentIdx;
            } else if (b == -1) {
                b = studentIdx;
            } else if (c == -1) {
                c = studentIdx;
                break; // 3명을 찾았으므로 루프 종료
            }
        }

        return 10000 * a + 100 * b + c;
    }
}