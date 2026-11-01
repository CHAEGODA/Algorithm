import java.util.*;

class Solution {
    public int solution(int[] d, int budget) {
        int count = 0;
        Arrays.sort(d);
        for (int num : d) {
            if (budget < num) {
                return count;
            }
            budget -= num;
            count++;
        }
        return count;
    }
}