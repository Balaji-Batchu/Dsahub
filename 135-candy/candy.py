class Solution:
    def candy(self, nums: List[int]) -> int:
        mini = [1]*len(nums)
        for x in range(1,len(nums)):
            if(nums[x] > nums[x - 1]):
                mini[x] = mini[x - 1] + 1
        for x in range(len(nums) - 2,-1, -1):
            if (nums[x] > nums[x + 1] and mini[x] <= mini[x + 1]):
                mini[x] = mini[x + 1] + 1
        return sum(mini)