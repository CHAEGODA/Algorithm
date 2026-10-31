import java.util.*;

class Solution {
    public String solution(String s) {
        char[] temp = s.toCharArray();
        String answer = "";
        Arrays.sort(temp);
        
        for (int i = temp.length - 1; i >= 0; i--) {
            answer += temp[i];
        }
        
        return answer;
    }
}