# https://leetcode-cn.com/problems/house-robber/

from typing import List


class Solution:
    def rob(self, nums: List[int]) -> int:
        # 设dp[i]: 0~i之间所能得到的最大值
        n = len(nums)
        dp = [0 for _ in range(n+1)]
        dp[0] = 0
        for i in range(1, n+1):
            if i == 1:
                dp[i] = nums[i-1]
            else:
                dp[i] = max(dp[i-2] + nums[i-1], dp[i-1])
        return dp[n]



if __name__ == '__main__':
    print(Solution().rob([2,7,9,3,1]))