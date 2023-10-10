class Solution:
    def findDifference(self, nums1: List[int], nums2: List[int]) -> List[List[int]]:
        for x in nums1:
            if(x in nums1 and x in nums2):
                nums1 = [y for y in nums1 if y != x]
                nums2 = [z for z in nums2 if z != x]
        return [list(set(nums1)), list(set(nums2))]