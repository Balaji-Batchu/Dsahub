class Solution {
    public int longestOnes(int[] nums, int k) {
        int n = nums.length, left = 0, right = 0;
        int maxLength = 0;
        int temp = 0;

        while(right < n) {
            if(nums[right] == 0) temp ++;

            if(temp > k) {
                if(nums[left] == 0) temp --;
                left ++;
            }

            if(temp <= k) maxLength = Math.max(maxLength, (right - left) + 1);

            right ++;
        }

        return maxLength;
    }
}