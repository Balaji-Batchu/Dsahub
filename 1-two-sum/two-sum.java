class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int x = 0; x < n; x ++) {
            int diff = target - nums[x];
            if(map.containsKey(diff)) {
                return new int[]{map.get(diff), x};
            } else {
                map.put(nums[x], x);
            }
        }
        return new int[]{-1,-1};
    }
}