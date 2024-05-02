class Solution {
    public int findMaxK(int[] nums) {
        int[] res = new int[2001];
        int max = -1;
        for(int x : nums){
            if(res[-x + 1000] == 1){
                max = Math.max(max, Math.abs(x));
            }
            else{
                res[x + 1000] = 1;
            }
        }
        return max;
    }
}