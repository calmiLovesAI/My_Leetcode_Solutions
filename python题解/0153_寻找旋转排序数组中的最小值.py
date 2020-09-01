from typing import List
import math
# https://leetcode-cn.com/problems/find-minimum-in-rotated-sorted-array/submissions/

class Solution:
    def findMin(self, nums: List[int]) -> int:
        l, r = 0, len(nums) - 1
        while l < r:
            mid = math.floor((l+r)/2)
            if nums[mid] <= nums[-1]:
                r = mid
            else:
                l = mid + 1
        return nums[l]


if __name__ == "__main__":
    print(Solution().findMin(nums=[3,4,5,1,2]))