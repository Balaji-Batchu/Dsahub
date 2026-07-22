class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> tracker = new HashMap<>();
        tracker.put(0, 1);
        int total = 0;
        int currentSum = 0;

        for(int x: nums) {
            currentSum += x;
            total += tracker.getOrDefault((currentSum - k), 0);
            tracker.put(currentSum, tracker.getOrDefault(currentSum, 0) + 1);
        }
        
        return total;
    }
}