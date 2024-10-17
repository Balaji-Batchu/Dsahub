class Solution {
    public int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;

        while(low <= high){
            int median = (low + high) / 2;

            if(target == nums[median]) return median;

            //check either left or right which part is sorted

            // if left sorted
            if(nums[low] <= nums[median]){
                if(nums[low] <= target && target <= nums[median]){
                    high = median - 1;
                }
                else{
                    low = median + 1;
                }
            }

            //if right sorted
            else{
                if(nums[median] <= target && target <= nums[high]){
                    low = median + 1;
                }
                else high = median - 1;
            }
        }

        return -1;
    }
}