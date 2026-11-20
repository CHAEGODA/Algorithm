import java.util.*;

class Solution {
    public String solution(String[] survey, int[] choices) {
        StringBuilder answer = new StringBuilder();
        Map<Character, Integer> map = new HashMap<>();

        String types = "RTCFJMAN";

        for (char c : types.toCharArray()) {
            map.put(c, 0);
        }

        for (int i = 0; i < survey.length; i++) {
            char first = survey[i].charAt(0);
            char second = survey[i].charAt(1);

            if (choices[i] < 4) {
                map.put(first, map.get(first) + (4 - choices[i]));
            } else if (choices[i] > 4) {
                map.put(second, map.get(second) + (choices[i] - 4));
            }
        }

        String[] pairs = {"RT", "CF", "JM", "AN"};

        for (String pair : pairs) {
            char first = pair.charAt(0);
            char second = pair.charAt(1);

            if (map.get(first) >= map.get(second)) {
                answer.append(first);
            } else {
                answer.append(second);
            }
        }

        return answer.toString();
    }
}