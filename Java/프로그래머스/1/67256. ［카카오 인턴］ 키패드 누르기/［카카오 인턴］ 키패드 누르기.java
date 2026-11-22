class Solution {
    public String solution(int[] numbers, String hand) {
        StringBuilder answer = new StringBuilder();

        int left = 10;
        int right = 12;

        for (int num : numbers) {
            if (num == 1 || num == 4 || num == 7) {
                answer.append("L");
                left = num;
            } else if (num == 3 || num == 6 || num == 9) {
                answer.append("R");
                right = num;
            } else {
                if (num == 0) {
                    num = 11;
                }

                int leftDist = Math.abs((left - 1) / 3 - (num - 1) / 3)
                             + Math.abs((left - 1) % 3 - (num - 1) % 3);

                int rightDist = Math.abs((right - 1) / 3 - (num - 1) / 3)
                              + Math.abs((right - 1) % 3 - (num - 1) % 3);

                if (leftDist < rightDist) {
                    answer.append("L");
                    left = num;
                } else if (leftDist > rightDist) {
                    answer.append("R");
                    right = num;
                } else {
                    if (hand.equals("left")) {
                        answer.append("L");
                        left = num;
                    } else {
                        answer.append("R");
                        right = num;
                    }
                }
            }
        }

        return answer.toString();
    }
}