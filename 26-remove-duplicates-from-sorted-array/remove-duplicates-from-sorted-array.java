class Solution {
    public int removeDuplicates(int[] nums) {
        int left = 0;
        int right = 1;
        int arraySize = nums.length;

        while(right < arraySize) {
            if(nums[left] != nums[right]) {
                left ++;
                nums[left] = nums[right];
            } else right ++;
        }
        return left + 1;
    }
}