
from typing import List
import math

# https://leetcode-cn.com/problems/search-in-rotated-sorted-array/submissions/

class Solution:
    def search(self, nums: List[int], target: int) -> int:
        min_v = min(nums)
        min_idx = nums.index(min_v)
        l = r = min_idx
        if target <= nums[-1]:
            r = len(nums) - 1
        else:
            l = 0
            r -= 1
        while l < r:
            mid = math.ceil((l+r)/2)
            if nums[mid] <= target:
                l = mid
            else:
                r = mid - 1
        if nums[l] == target:
            return l
        else:
            return -1


if __name__ == "__main__":
    pass