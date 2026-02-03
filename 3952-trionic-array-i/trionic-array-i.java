class Solution {
    public boolean isTrionic(int[] nums) {
        int n = nums.length;

        int l = 1, r = n - 2;

        if(nums[l] <= nums[0] || nums[r] >= nums[n - 1]) return false;

        while(l < n - 2 && nums[l] < nums[l + 1]) {
            l ++;
        }

        while(r > 1 && nums[r] > nums[r - 1]) {
            r --;
        }

        if(r <= l) return false;

        System.out.println("L: "+ l + " R: "+ r);

        while(l != r) {
            System.out.println("l : " + l + " - r: " + r);
            if(nums[l] <= nums[l + 1]) {
                System.out.println("checking for tl : " + nums[l] + " - tr: " + nums[l + 1]);
                return false;
            }
            l ++;
        }
        return true;
    }
}