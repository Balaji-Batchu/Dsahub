class Solution {
    public int missingNumber(int[] nums) {
        int sum = 0, n = nums.length;
        for(int x: nums) sum += x;

        int expected = n * (n + 1) / 2;

        return expected - sum;
    }
}