class Solution {
    public boolean canJump(int[] nums) {
        int maxIndex = 0, n = nums.length;

        for(int x = 0; x < n; x ++){
            if(x > maxIndex) return false;
            if(maxIndex > n) return true;

            maxIndex = Math.max(maxIndex, x + nums[x]);
        }

        return true;
    }
}