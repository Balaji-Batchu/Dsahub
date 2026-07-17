class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> countTracker = new HashMap<>();
        countTracker.put(0,1);
        int sum = 0, count = 0;

        for(int x: nums) {
            sum += x;
            count += countTracker.getOrDefault(sum - k, 0);
            countTracker.put(sum, countTracker.getOrDefault(sum, 0) + 1);
        }

        return count;
    }
}