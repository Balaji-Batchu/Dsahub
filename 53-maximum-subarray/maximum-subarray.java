class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE, temp = 0;
        int left = 0;
        for(int x: nums) {
            temp += x;
            maxSum = Math.max(maxSum, temp);
            if(temp < 0) temp = 0; 
        }

        return maxSum;
    }
}