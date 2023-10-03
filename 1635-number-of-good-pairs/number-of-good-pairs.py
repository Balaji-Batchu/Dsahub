class Solution:
    def numIdenticalPairs(self, nums: List[int]) -> int:
        left = 0
        count = 0
        while left < len(nums) - 1:
            right = left + 1
            while right < len(nums):
                if(nums[left] == nums[right]):
                    count += 1
                right += 1    
            left += 1
        return count