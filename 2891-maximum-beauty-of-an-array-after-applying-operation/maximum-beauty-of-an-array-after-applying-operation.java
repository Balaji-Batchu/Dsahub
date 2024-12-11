class Solution {
    public int maximumBeauty(int[] nums, int k) {
        Arrays.sort(nums);
        int left = 0, count = 0, n = nums.length;
        for(int right = 0; right < n; right ++){
            while(nums[right] - nums[left] > 2*k){
                left ++;
            }
            count = Math.max(count, right - left + 1);
        }
        return count;
    }
}