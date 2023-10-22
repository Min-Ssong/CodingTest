package programmers;
import java.util.Arrays;
import java.util.Comparator;

public class pr120880_0 {
    class Solution {
        public int[] solution(int[] numlist, int n) {
            // 각 숫자와 n 사이의 거리와 숫자 값을 저장하는 Integer 배열을 생성합니다.
            Integer[][] distanceAndValue = new Integer[numlist.length][2];
            for (int i = 0; i < numlist.length; i++) {
                distanceAndValue[i][0] = Math.abs(numlist[i] - n); // 거리
                distanceAndValue[i][1] = numlist[i]; // 숫자 값
            }

            // 거리로 오름차순 정렬하고, 거리가 같을 경우 숫자 값으로 내림차순 정렬합니다.
            Arrays.sort(distanceAndValue, new Comparator<Integer[]>() {
                @Override
                public int compare(Integer[] o1, Integer[] o2) {
                    int compareDistance = o1[0].compareTo(o2[0]);
                    if (compareDistance == 0) {
                        return o2[1].compareTo(o1[1]); // 숫자 값으로 내림차순 정렬
                    }
                    return compareDistance; // 거리로 오름차순 정렬
                }
            });

            // 결과 배열에 정렬된 숫자 값을 저장합니다.
            int[] result = new int[numlist.length];
            for (int i = 0; i < numlist.length; i++) {
                result[i] = distanceAndValue[i][1];
            }
            return result;
        }
    }
}
