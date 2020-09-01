# https://leetcode-cn.com/problems/find-first-and-last-position-of-element-in-sorted-array/

from typing import List
import math

class Solution:
    def searchRange(self, nums: List[int], target: int) -> List[int]:
        n = len(nums)
        if not nums:
            return [-1, -1]
        


        # 左右index
        l, r = 0, n-1
        while l < r:
            
            mid = math.floor((l + r) / 2)
            if nums[mid] >= target:
                r = mid
            else:
                l = mid + 1
            # print("l, mid, r: ", l, mid, r)
        if nums[r] != target:
            return [-1, -1]
        
        start_idx = r
        l, r = 0, n-1
        while l < r:
            mid = math.ceil((l + r) / 2)
            if nums[mid] <= target:
                l = mid
            else:
                r = mid - 1
        
        end_idx = r
            
        return [start_idx, end_idx]





if __name__ == "__main__":
    print(Solution().searchRange(nums=[5,7,7,8,8,10], target=8))