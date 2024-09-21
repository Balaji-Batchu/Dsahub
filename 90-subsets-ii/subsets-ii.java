class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums); // Sort the array to handle duplicates
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        backtrack(nums, ans, temp, 0);
        return ans;
    }

    private void backtrack(int[] nums, List<List<Integer>> ans, List<Integer> temp, int start) {
        ans.add(new ArrayList<>(temp)); // Add the current subset to the answer

        for (int i = start; i < nums.length; i++) {
            // If the current element is the same as the previous one, skip it to avoid duplicates
            if (i > start && nums[i] == nums[i - 1]) {
                continue;
            }
            temp.add(nums[i]); // Include the current element
            backtrack(nums, ans, temp, i + 1); // Move to the next element
            temp.remove(temp.size() - 1); // Backtrack
        }
    }
}
