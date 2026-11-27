class Solution {
    public int[] solution(String[] park, String[] routes) {
        int h = 0;
        int w = 0;

        int H = park.length;
        int W = park[0].length();

        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                if (park[i].charAt(j) == 'S') {
                    h = i;
                    w = j;
                }
            }
        }

        for (String route : routes) {
            String[] command = route.split(" ");
            char dir = command[0].charAt(0);
            int distance = Integer.parseInt(command[1]);

            int dh = 0;
            int dw = 0;

            if (dir == 'N') dh = -1;
            else if (dir == 'S') dh = 1;
            else if (dir == 'W') dw = -1;
            else if (dir == 'E') dw = 1;

            int nh = h;
            int nw = w;
            boolean possible = true;

            for (int i = 0; i < distance; i++) {
                nh += dh;
                nw += dw;

                if (nh < 0 || nh >= H || nw < 0 || nw >= W) {
                    possible = false;
                    break;
                }

                if (park[nh].charAt(nw) == 'X') {
                    possible = false;
                    break;
                }
            }

            if (possible) {
                h = nh;
                w = nw;
            }
        }

        return new int[]{h, w};
    }
}