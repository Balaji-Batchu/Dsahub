class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxi = 0;
        int count = 0;
        for(int x: nums){
            if(x == 1){
                count ++;
                maxi = Math.max(maxi, count);
            }
            else{
                count = 0;
            }
        }
        return maxi;
    }
}