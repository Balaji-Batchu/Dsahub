class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0, n = prices.length;
        int left = 0, right = 1;

        while(right < n){
            int diff = prices[right] - prices[left];

            profit = Math.max(profit, diff);
            
            if(prices[right] < prices[left]) left = right;

            right ++;
        }

        return profit;
    }
}