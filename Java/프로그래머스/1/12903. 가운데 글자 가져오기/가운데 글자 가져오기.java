class Solution {
    public String solution(String s) {
        String answer = "";
        
        if (s.length() % 2 == 0) {
            int i = s.length() / 2;
            return answer + s.charAt(i - 1) + s.charAt(i);
        } else {
            return answer + s.charAt(s.length() / 2);
        }
    }
}