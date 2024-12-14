class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> subset = new ArrayList<>();
        int current = 0, n = nums.length;
        List<List<Integer>> ans = new ArrayList<>();
        return helper(subset, current, n, nums, ans);
    }

    public static List<List<Integer>> helper(List<Integer> subset, int current, int n,
                                                int[] nums, List<List<Integer>> ans){
            
            if(current == n){
                ans.add(new ArrayList<>(subset));
                return ans;
            }

            subset.add(nums[current]);
            helper(subset, current + 1, n, nums, ans);

            subset.remove(subset.size() - 1);
            helper(subset, current + 1, n, nums, ans);

            return ans;
        }
}