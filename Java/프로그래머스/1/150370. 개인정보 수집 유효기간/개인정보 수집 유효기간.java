import java.util.*;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        Map<String, Integer> map = new HashMap<>();
        List<Integer> answer = new ArrayList<>();

        for (String term : terms) {
            String[] parts = term.split(" ");
            map.put(parts[0], Integer.parseInt(parts[1]));
        }

        int todayDays = toDays(today);

        for (int i = 0; i < privacies.length; i++) {
            String[] parts = privacies[i].split(" ");

            int collectedDays = toDays(parts[0]);
            int validDays = map.get(parts[1]) * 28;

            if (collectedDays + validDays <= todayDays) {
                answer.add(i + 1);
            }
        }

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }

    private int toDays(String date) {
        String[] parts = date.split("\\.");

        int year = Integer.parseInt(parts[0]);
        int month = Integer.parseInt(parts[1]);
        int day = Integer.parseInt(parts[2]);

        return year * 12 * 28 + month * 28 + day;
    }
}