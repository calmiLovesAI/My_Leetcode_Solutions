# https://leetcode-cn.com/problems/remove-duplicates-from-sorted-array/

from typing import List

class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        n = len(nums)
        i = j = 0
        while i < n and j < n:
            if nums[j] == nums[i]:
                j += 1
            else:
                i += 1
                nums[i] = nums[j]
        return i+1


if __name__ == "__main__":
    print(Solution().removeDuplicates(nums=[0,0,1,1,1,2,2,3,3,4]))