class Solution {
    public int maxSubArray(int[] nums) {
        int ans = Integer.MIN_VALUE, n = nums.length, sum = 0;

        for(int x = 0; x < n; x ++){
            sum += nums[x];
            ans = Math.max(ans, sum);
            if(sum < 0) sum = 0;
        }

        return ans;
    }
}