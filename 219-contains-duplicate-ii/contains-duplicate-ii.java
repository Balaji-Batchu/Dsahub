class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length;

        for(int x = 0; x < n; x ++) {
            if(map.containsKey(nums[x])) {
                if(Math.abs(map.get(nums[x]) - x) <= k) return true;
            } 
            map.put(nums[x], x);
        }

        return false;
    }
}