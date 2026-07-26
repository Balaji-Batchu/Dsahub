class Solution {
    public int maxProfit(int[] prices) {
        int left = 0, right = 1, n = prices.length;
        int maxProfit = 0;

        while(right < n) {
            if(prices[right] < prices[left]) {
                left = right;
                right ++;
            } else {
                maxProfit = Math.max(maxProfit, prices[right] - prices[left]);
                right ++;
            }
        }
        return maxProfit;
    }
}