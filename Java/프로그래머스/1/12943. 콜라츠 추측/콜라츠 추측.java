class Solution {
    public int solution(int num) {
        int count = 0;
        long n = num;
        if (n == 1) {
            return 0;
        }
        while (n != 1) {
            count++;
            if (n % 2 == 0) {
                n /= 2;
            } else if (n % 2 == 1) {
                n = (n * 3) + 1;
            }
            if (count == 500 && n != 1) {
                return -1;
            }
        }
        return count;
    }
}