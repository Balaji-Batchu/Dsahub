class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxSequenceLength = 0, counter = 0;
        int pointer = 0, right = 0, n = nums.length;

        for(int x: nums) {
            if(x == 1) {
                counter ++;
                maxSequenceLength = Math.max(maxSequenceLength, counter);
            }
            else counter = 0;
        } 
        return maxSequenceLength;
    }
}