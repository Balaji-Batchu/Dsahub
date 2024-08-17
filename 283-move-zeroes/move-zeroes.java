class Solution {
    public void moveZeroes(int[] nums) {
        int l = 0, r = 0;

        while(l < nums.length && r < nums.length){
            while(l < nums.length && nums[l] != 0){
                l ++;
            }
            r = l;
            while(r < nums.length && nums[r] == 0){
                r ++;
            }
            if(r < nums.length && l < nums.length){
                nums[l] = nums[r];
                nums[r] = 0;
                l ++;
            }
        }
    }
}