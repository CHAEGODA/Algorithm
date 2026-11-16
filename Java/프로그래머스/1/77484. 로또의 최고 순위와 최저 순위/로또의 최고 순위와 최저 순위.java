class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int zero = 0;
        int match = 0;

        for (int lotto : lottos) {
            if (lotto == 0) {
                zero++;
                continue;
            }

            for (int win : win_nums) {
                if (lotto == win) {
                    match++;
                    break;
                }
            }
        }

        int max = match + zero;
        int min = match;

        int[] rank = {6, 6, 5, 4, 3, 2, 1};

        return new int[]{rank[max], rank[min]};
    }
}