class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] pronounce = {"aya", "ye", "woo", "ma"};

        for (String b : babbling) {
            int pos = 0;
            int previous = -1;

            while (pos < b.length()) {
                boolean found = false;

                for (int i = 0; i < pronounce.length; i++) {
                    if (previous != i &&
                        b.startsWith(pronounce[i], pos)) {

                        pos += pronounce[i].length();
                        previous = i;
                        found = true;
                        break;
                    }
                }

                if (!found) {
                    break;
                }
            }

            if (pos == b.length()) {
                answer++;
            }
        }

        return answer;
    }
}