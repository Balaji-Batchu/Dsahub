class Solution {
    public int removeElement(int[] nums, int val) {
        int left = 0;
        int right = 0;
        int arraySize = nums.length;

        while(right < arraySize) {
            if(nums[right] == val) {
                right ++;
            } else {
                nums[left] = nums[right];
                left ++;
                right ++;
            }
        }

        return left;
    }
}