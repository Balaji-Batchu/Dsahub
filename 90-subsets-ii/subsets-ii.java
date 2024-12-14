import java.util.*;

class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);  // Sort the array to handle duplicates
        List<List<Integer>> result = new ArrayList<>();
        backtrack(nums, 0, new ArrayList<>(), result);
        return result;
    }

    private void backtrack(int[] nums, int start, List<Integer> currentSubset, List<List<Integer>> result) {
        // Add the current subset to the result
        result.add(new ArrayList<>(currentSubset));

        // Explore further subsets starting from each index
        for (int i = start; i < nums.length; i++) {
            // Skip duplicates: if the current element is the same as the previous one, skip it
            if (i > start && nums[i] == nums[i - 1]) {
                continue;
            }
            // Include the current element and move forward
            currentSubset.add(nums[i]);
            backtrack(nums, i + 1, currentSubset, result);
            // Backtrack: remove the last element and try the next possibility
            currentSubset.remove(currentSubset.size() - 1);
        }
    }
}
