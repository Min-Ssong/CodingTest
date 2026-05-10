import java.util.*;

public class Solution{
    public static int[] solution(int[] numbers){
        Set<Integer> resultSet = new HashSet<>();
        for(int i = 0; i < numbers.length; i++){
            for(int j = i+1; j < numbers.length; j++){
                int addNumber = numbers[i] + numbers[j];
                resultSet.add(addNumber);

            }
        }

        return resultSet.stream()
                .mapToInt(Integer::intValue)
                .sorted()
                .toArray();
    }
}