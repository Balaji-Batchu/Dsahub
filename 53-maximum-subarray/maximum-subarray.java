class Solution {
    public int maxSubArray(int[] nums) {
        int ans = Integer.MIN_VALUE, sum = 0, n = nums.length;

        for(int x = 0; x < n; x ++){
            sum += nums[x];
            ans = Math.max(ans, sum);
            if(sum < 0) sum = 0;
        }

        return ans;
    }
}