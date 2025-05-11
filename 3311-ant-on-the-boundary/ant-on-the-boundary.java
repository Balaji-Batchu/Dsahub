class Solution {
    public int returnToBoundaryCount(int[] nums) {
        int count = 0, temp = 0;

        for(int x: nums) {
            temp += x;
            if(temp == 0) count ++;
        }

        return count;
    }
}