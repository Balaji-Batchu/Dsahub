class Solution {
    private long helper(int[] nums, int target) {
        long res = 0;
        int j = nums.length - 1;
        for (int i = 0; i < j; i++) {
            while (i < j && nums[i] + nums[j] > target) {
                j--;
            }
            res += j - i;
        }
        return res;
    }
    
    public long countFairPairs(int[] nums, int lower, int upper) {
        Arrays.sort(nums);
        return helper(nums, upper) - helper(nums, lower - 1);
    }
}