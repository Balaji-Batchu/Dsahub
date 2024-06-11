class Solution {
    public int arraySign(int[] nums) {
        int odd = 0;
        for(int x: nums){
            if(x == 0) return 0;
            if(x < 0) odd += 1;
        }
        return odd % 2 == 0 ? 1 : -1;
    }
}