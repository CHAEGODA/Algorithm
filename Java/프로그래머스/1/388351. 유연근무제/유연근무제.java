class Solution {
    public int solution(int[] schedules, int[][] timelogs, int startday) {
        int answer = 0;

        for (int i = 0; i < schedules.length; i++) {
            int hour = schedules[i] / 100;
            int minute = schedules[i] % 100;
            int limit = hour * 60 + minute + 10;

            boolean success = true;

            for (int j = 0; j < 7; j++) {
                int day = (startday + j - 1) % 7 + 1;

                if (day == 6 || day == 7) {
                    continue;
                }

                int time = timelogs[i][j];
                int arrival = (time / 100) * 60 + time % 100;

                if (arrival > limit) {
                    success = false;
                    break;
                }
            }

            if (success) {
                answer++;
            }
        }

        return answer;
    }
}