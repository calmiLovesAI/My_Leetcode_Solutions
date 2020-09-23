# https://leetcode-cn.com/problems/shu-zu-zhong-zhong-fu-de-shu-zi-lcof/

from typing import List
from collections import defaultdict

# 第一种解法：使用hash表
class Solution:
    def findRepeatNumber(self, nums: List[int]) -> int:
        d = defaultdict(int)
        for item in nums:
            if d[item] == 1:
                return item
            else:
                d[item] += 1


class Solution2:
    def findRepeatNumber(self, nums: List[int]) -> int:
        nums.sort()
        n = len(nums)
        for i in range(n-1):
            if nums[i] == nums[i+1]:
                return nums[i]



class Solution3:
    def findRepeatNumber(self, nums: List[int]) -> int:
        s = set()
        n = len(nums)
        for i in range(n):
            s.add(nums[i])
            if len(s) < i+1:
                return nums[i]
