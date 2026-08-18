class Solution {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length, sum = 0;
        int total = 0;
        HashMap<Integer, Integer> occurences = new HashMap<>();
        occurences.put(0, 1);

        for(int x = 0; x < n; x ++) {
            sum += nums[x];
            total += occurences.getOrDefault(sum - k, 0);
            occurences.put(sum, occurences.getOrDefault(sum, 0) + 1);
        }
        return total;
    }
}