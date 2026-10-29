import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        ArrayList<Integer> list = new ArrayList<>();
        
        for (int num : arr) {
            if (num % divisor == 0) {
                list.add(num);
            }
               
        }
        if (list.isEmpty()) {
            list.add(-1);
        }
        Collections.sort(list);
        return list.stream().mapToInt(Integer::intValue).toArray();
        
    
    }
}