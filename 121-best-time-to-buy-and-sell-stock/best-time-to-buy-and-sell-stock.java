class Solution {
    public int maxProfit(int[] prices) {
        int left = 0;
        int right = 1;
        int arrSize = prices.length;
        int maxProfit = 0;

        while(right < arrSize) {
            if(prices[left] < prices[right]) {
                maxProfit = Math.max(maxProfit, prices[right] - prices[left]);
                right ++;
            } else {
                left = right;
                right = right + 1;
            }
        }
        return maxProfit;
    }
}