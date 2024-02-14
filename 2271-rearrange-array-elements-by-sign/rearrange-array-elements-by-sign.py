class Solution:
    def rearrangeArray(self, nums: List[int]) -> List[int]:
        pos = [x for x in nums if x >= 0]
        neg = [x for x in nums if x < 0]
        res = []
        for x in range(len(pos)):
            res.append(pos[x])
            res.append(neg[x])

        return res