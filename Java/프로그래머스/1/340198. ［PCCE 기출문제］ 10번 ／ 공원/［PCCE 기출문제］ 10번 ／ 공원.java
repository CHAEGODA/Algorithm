import java.util.*;

class Solution {
    public int solution(int[] mats, String[][] park) {
        Arrays.sort(mats);

        int h = park.length;
        int w = park[0].length;

        for (int k = mats.length - 1; k >= 0; k--) {
            int size = mats[k];

            for (int i = 0; i <= h - size; i++) {
                for (int j = 0; j <= w - size; j++) {
                    boolean possible = true;

                    for (int x = i; x < i + size; x++) {
                        for (int y = j; y < j + size; y++) {
                            if (!park[x][y].equals("-1")) {
                                possible = false;
                                break;
                            }
                        }

                        if (!possible) {
                            break;
                        }
                    }

                    if (possible) {
                        return size;
                    }
                }
            }
        }

        return -1;
    }
}