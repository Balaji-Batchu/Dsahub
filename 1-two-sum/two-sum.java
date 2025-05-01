class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> occ = new HashMap<>();
        for(int x = 0; x < nums.length; x ++){
            int diff = target - nums[x];
            if(occ.containsKey(diff)) return new int[]{occ.get(diff), x};

            occ.put(nums[x], x);
        }

        return new int[]{};
    }
}