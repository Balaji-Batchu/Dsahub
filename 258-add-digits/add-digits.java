class Solution {
    public int addDigits(int num) {
        int ans = 0;
        int temp = num;
        while(temp > 9 || ans > 9) {
            while(temp > 0) {
                ans += temp % 10;
                temp /= 10;
            }
            if(ans > 9) {
                temp = ans;
                ans = 0;
            }
        }
        return ans + temp;
    }
}