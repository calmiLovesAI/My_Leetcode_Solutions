# https://leetcode-cn.com/problems/maximum-subarray/

from typing import List
import math


class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        n = len(nums)
        dp = [-math.inf for _ in range(n)]
        dp[0] = nums[0]
        for i in range(1, n):
            if dp[i-1] <= 0:
                dp[i] = nums[i]
            else:
                dp[i] = dp[i-1] + nums[i]
        return max(dp)


if __name__ == '__main__':
    print(Solution().maxSubArray(nums=[-2,1,-3,4,-1,2,1,-5,4]))