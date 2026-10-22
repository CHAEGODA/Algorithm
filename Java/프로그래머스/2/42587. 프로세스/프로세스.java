import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        Deque<int[]> queue = new ArrayDeque<>();
        int count = 0;
        for (int i = 0; i < priorities.length; i++) {
            queue.offer(new int[]{i, priorities[i]});
        }
        while(!queue.isEmpty()) {
            int[] cur = queue.poll();
            boolean hasHigher = false;
            for(int[] process : queue) {
                if (cur[1] < process[1]) {
                    hasHigher = true;
                    break;
                } 
            }
            if (hasHigher) {
                queue.offer(cur);
            } else {
                count++;
                if (cur[0] == location) {
                    return count;
                }    
            }          
        }
         return -1;     
    }
}