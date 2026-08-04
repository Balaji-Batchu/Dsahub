class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxi = 0, temp = 0;

        for(int x: nums) {
            if(x == 1) {
                temp ++;
            } else {
                maxi = Math.max(maxi, temp);
                temp = 0;
            } 
        }
        maxi = Math.max(maxi, temp);
        return maxi;
    }
}