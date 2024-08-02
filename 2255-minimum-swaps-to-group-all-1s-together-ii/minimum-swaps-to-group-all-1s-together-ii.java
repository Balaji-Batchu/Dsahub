class Solution {
    public int minSwaps(int[] nums) {

        int count = 0;
        for(int x: nums){
            if(x == 1) count ++;
        }

        int n = nums.length;
        int left = 0;
        int temp = 0;
        int mini = Integer.MAX_VALUE;

        for(int right = 0; right < 2 * n; right ++){
            if(nums[right % n] == 1) temp ++;
            if(right - left + 1 > count){
                temp -= nums[left % n];
                left ++;
            }
            mini = Math.min(mini, count - temp);            
        }
        return mini;
    }
}