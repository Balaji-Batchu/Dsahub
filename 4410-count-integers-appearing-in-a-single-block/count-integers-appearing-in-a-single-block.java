class Solution {
    public int countSpecialIntegers(int[] nums) {

        int len = nums.length;
        if(len == 0 || len == 1) return len;

        int[] numss = new int[101];
        int seq = nums[0], total = 1;
        numss[seq] = 1;
        for(int x = 0; x < len; x ++) {
            if(nums[x] == seq) continue;

            else {
                seq = nums[x];
                if(numss[seq] == 0) {
                    numss[seq] = 1;
                    total ++;
                }
                else if(numss[seq] == 1) {
                    numss[seq] = 2;
                    total --;
                }
            }
        }

        return total;
    }
}