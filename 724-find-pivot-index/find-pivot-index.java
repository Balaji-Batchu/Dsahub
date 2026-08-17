class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        int[] prefixSum = new int[n + 1];
        int left = 0, right = 0;

        prefixSum[0] = 0;

        for (int pointer = 0; pointer < n; pointer ++) {
            prefixSum[pointer + 1] = nums[pointer] + prefixSum[pointer];
        }

        for (int pointer = 0; pointer < n; pointer ++) {
            System.out.println("left: " + prefixSum[pointer] + " right: " + (prefixSum[n] - prefixSum[pointer + 1]));
            if(prefixSum[pointer] == (prefixSum[n] - prefixSum[pointer + 1])) return pointer;
        }
        return -1; 
    }
}