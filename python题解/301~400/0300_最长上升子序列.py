
from typing import List



class Solution:

    def lengthOfLIS(self, nums: List[int]) -> int:
        n = len(nums)
        if not n:
            return 0
        # dp[i]: 以i结尾的上升子序列的长度
        dp = [1 for _ in range(n)]
        # dp[0] = 1
        for i in range(1, n):
            for j in range(i):
                if nums[j] < nums[i]:
                    dp[i] = max(dp[i], dp[j] + 1)

        return max(dp)


if __name__ == '__main__':
    print(Solution().lengthOfLIS(nums=[10,9,2,5,3,7,101,18]))