
from typing import List
import math


class Solution:
    def threeSumClosest(self, nums: List[int], target: int) -> int:
        ans = 0
        min_distance = math.inf
        n = len(nums)
        nums.sort()
        for k in range(n):
            if k > 0 and nums[k] == nums[k-1]:
                continue

            i = k+1
            j = n-1
            while i < j:
                s = nums[k] + nums[i] + nums[j]
                if abs(s - target) < min_distance:
                    min_distance = abs(s - target)
                    ans = s
                if s == target:
                    return s
                if s > target:
                    j0 = j - 1
                    while i < j0 and nums[j0] == nums[j]:
                        j0 -= 1
                    j = j0
                if s < target:
                    i0 = i + 1
                    while i0 < j  and nums[i0] == nums[i]:
                        i0 += 1
                    i = i0



        return int(ans)


if __name__ == '__main__':
    print(Solution().threeSumClosest(nums = [-3, 0, 1, 2], target = 1))