class Solution {
    public long solution(int price, int money, int count) {
        long answer = 0;
        long sum = 0;
        
        for (int i = 1; i <= count; i++) {
            sum += (long)price * i;
        }
        long remain = money - sum;
        if (remain < 0) {
            return -remain;
        } else {
            return 0;
        }
    }
}