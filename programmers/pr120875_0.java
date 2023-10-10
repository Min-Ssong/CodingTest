package programmers;
public class pr120875_0 {
    class Solution {
        public int solution(int[][] dots) {
            // 0 1 / 2 3
            double oneStartDot = (double)(dots[0][0] - dots[1][0]) / (dots[2][0] - dots[3][0]);
            double oneEndDot   = (double)(dots[0][1] - dots[1][1]) / (dots[2][1] - dots[3][1]);
            // 0 2 / 1 3
            double twoStartDot = (double)(dots[0][0] - dots[2][0]) / (dots[1][0] - dots[3][0]);
            double twoEndDot   = (double)(dots[0][1] - dots[2][1]) / (dots[1][1] - dots[3][1]);
            // 0 3 / 1 2
            double threeStartDot = (double)(dots[0][0] - dots[3][0]) / (dots[1][0] - dots[2][0]);
            double threeEndDot   = (double)(dots[0][1] - dots[3][1]) / (dots[1][1] - dots[2][1]);
            return oneStartDot == oneEndDot || twoStartDot == twoEndDot || threeStartDot == threeEndDot ? 1 : 0;
        }
    }
}