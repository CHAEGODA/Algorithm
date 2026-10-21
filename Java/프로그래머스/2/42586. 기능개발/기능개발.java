import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int n = progresses.length;
        int cnt = 0;
        List<Integer> answer = new ArrayList<>();
        Deque<Integer> queue = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            int remain = 100 - progresses[i];
            queue.offer((int) Math.ceil((double) remain /speeds[i]));
        }
        while(!queue.isEmpty()) {
            int cur = queue.poll();
            cnt = 1;
            while(!queue.isEmpty() && queue.peek() <= cur) {
                queue.poll();
                cnt++;
            }
            answer.add(cnt);
        }
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}