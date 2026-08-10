class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int left = 0, right = 0, n = nums.length;
        int product = 1, maxSubArrays = 0;

        while(right < n) {
            product *= nums[right];

            while(left <= right &&  product >= k) {
                product /= nums[left];
                left ++;
            }

            maxSubArrays += (right - left + 1);
            right ++;
        }
        return maxSubArrays;
    }
}