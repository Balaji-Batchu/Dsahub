class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n = nums.length;
        int left = 0;
        int right = n - 1;
        int[] ans = new int[2];

        while(left <= right){
            int medium = left + (right - left) / 2;

            if(nums[medium] == target){
                int i = medium, j = medium;

                while(i >= 0 && nums[i] == target) i --;
                while(j < n && nums[j] == target) j ++;

                ans[0] = i + 1;
                ans[1] = j - 1;

                return ans;
            }

            else if(nums[medium] > target) 
                right = medium - 1;

            else
                left = medium + 1;       
        }

        return new int[]{-1, -1};
    }
}