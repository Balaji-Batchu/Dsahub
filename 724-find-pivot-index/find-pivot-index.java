class Solution {
    public int pivotIndex(int[] nums) {
        int arrSize = nums.length;
        int[] prefixSum = new int[arrSize + 1];
        prefixSum[0] = 0;
        for(int x = 0; x < arrSize; x ++) {
            prefixSum[x + 1] = prefixSum[x] + nums[x];
        }

        for(int x = 0; x < arrSize; x ++) {
            int leftSum = prefixSum[x];
            int rightSum = prefixSum[arrSize] - prefixSum[x + 1]; 
            if(leftSum == rightSum) return x;
        }
        return -1;
    }
}