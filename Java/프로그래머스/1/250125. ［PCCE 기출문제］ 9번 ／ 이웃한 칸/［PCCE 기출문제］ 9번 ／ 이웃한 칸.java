class Solution {
    public int solution(String[][] board, int h, int w) {
        int n = board.length;
        int answer = 0;
        int[] dh = {1, 0, -1, 0};
        int[] dw = {0, 1, 0, -1};
        String target = board[h][w]; 
        for(int i = 0; i < dh.length; i++) {
            int nh = h + dh[i];
            int nw = w + dw[i];
            if(nh >= 0 && nh < n && nw >= 0 && nw < n) {
                if (target.equals(board[nh][nw])) {
                    answer++;
                }  
            }
            
        }
        return answer;
    }
}