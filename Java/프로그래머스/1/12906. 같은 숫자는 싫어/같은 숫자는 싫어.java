import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int n = arr.length;
        List<Integer> answer = new ArrayList<>();
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] == arr[i+1]) {
                continue;
            } else {
                answer.add(arr[i]);
            }
        }
        answer.add(arr[n - 1]);
        
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}