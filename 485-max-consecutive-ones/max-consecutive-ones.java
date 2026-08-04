class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxi = 0, temp = 0;

        for(int x: nums) {
            if(x == 1) {
                temp ++;
                maxi = Math.max(maxi, temp);
            } else temp = 0;
        }
        return maxi;
    }
}