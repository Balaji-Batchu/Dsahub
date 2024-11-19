import java.util.HashMap;

class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        long maxSum = 0;
        long currentSum = 0;
        int n = nums.length;
        
        int left = 0;
        for (int right = 0; right < n; right++) {
            // Add the current element to the sum and frequency map
            currentSum += nums[right];
            freqMap.put(nums[right], freqMap.getOrDefault(nums[right], 0) + 1);

            // If the window size exceeds k, shrink it from the left
            if (right - left + 1 > k) {
                freqMap.put(nums[left], freqMap.get(nums[left]) - 1);
                if (freqMap.get(nums[left]) == 0) {
                    freqMap.remove(nums[left]);
                }
                currentSum -= nums[left];
                left++;
            }
            
            // Check if the window has exactly k distinct elements
            if (right - left + 1 == k && freqMap.size() == k) {
                maxSum = Math.max(maxSum, currentSum);
            }
        }
        
        return maxSum;
    }
}
