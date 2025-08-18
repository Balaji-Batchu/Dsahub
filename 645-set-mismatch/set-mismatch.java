class Solution {
    public int[] findErrorNums(int[] nums) {
        int sum = 0, nsum = 0, rep = 0;
        HashMap<Integer, Integer> dup = new HashMap<>();
        for (int i = 1; i <= nums.length; i ++) {
            sum += nums[i - 1];
            nsum += i;
            if(dup.containsKey(nums[i - 1])) rep = nums[i - 1];
            else dup.put(nums[i - 1], 1);
        }
        return new int[] {rep, rep + (nsum - sum)};
    }
}