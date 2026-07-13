class Solution {
    public int singleNumber(int[] nums) {
        int x = nums[0], n = nums.length;
        for(int y = 1; y < n; y ++) {
            x = x ^ nums[y];
        }
        return x;
    }
}