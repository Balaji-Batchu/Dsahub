class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxSequenceLength = 0;
        int left = 0, right = 0, n = nums.length;

        while(right < n) {
            System.out.println("Left: " + left + " right: " + right);
            while(right < n && nums[right] == 1) {
                right ++;
            }
            System.out.println(" right: " + right);
            maxSequenceLength = Math.max(maxSequenceLength, right - left);
            while(right < n && nums[right] == 0) {
                right ++;
            }
            left = right;
        }
        maxSequenceLength = Math.max(maxSequenceLength, right - left);

        return maxSequenceLength;
    }
}