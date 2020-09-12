# https://leetcode-cn.com/problems/jian-sheng-zi-lcof/


class Solution:
    def cuttingRope(self, n: int) -> int:
        # 设dp[i] 表示长度为i的绳子得到的最大乘积
        # dp[i] 与 dp[i-1]之间的关系？没有直接关系，因为剪绳子的过程中，对于每一种长度，我们都是重新剪的
        # 于是，关注“剪”的这个过程，假设最后一段的长度为k(0<k<i)，那么dp[i] = max(dp[i-k]*k)
        dp = [0 for _ in range(n+1)]
        for i in range(1, n+1):
            if i == 1:
                dp[i] = 1
            else:
                for k in range(1, i):
                    dp[i] = max(dp[i], max(dp[i-k]*k, (i-k)*k))

        return dp[-1]


if __name__ == '__main__':
    print(Solution().cuttingRope(n=10))