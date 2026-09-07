class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length;

        for(int x = 0; x < n; x ++) {
            Integer prev = map.put(nums[x], x);
            if(prev != null && Math.abs(x - prev) <= k) return true;
        }

        return false;
    }
}