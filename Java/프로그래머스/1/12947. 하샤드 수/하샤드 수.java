class Solution {
    public boolean solution(int x) {
        int temp = x;
        int num = 0;
        while (temp != 0) {
            num += temp % 10;
            temp = temp / 10;
        }
        if (x % num == 0) {
            return true;
        } else {
            return false;
        }
    }
}