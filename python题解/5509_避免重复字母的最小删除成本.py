# https://leetcode-cn.com/problems/minimum-deletion-cost-to-avoid-repeating-letters/

from typing import List
import math

# 超时了。。。
class Solution:
    def char2num(self, c):
        return ord(c) - ord("a")

    def minCost(self, s: str, cost: List[int]) -> int:
        n = len(cost)
        # n行27列
        f = [[math.inf for _ in range(27)] for _ in range(n)]
        # 第一个字符
        f[0][self.char2num(s[0])] = 0  # 不删
        f[0][26] = cost[0]   # 删除，剩余的是空白，对应数字26
        for i in range(1, n):
            # 不删除第i个字符
            for j in range(27):
                f[i][j] = f[i-1][j] + cost[i]
            # 删除第i个字符
            j = self.char2num(s[i])
            for k in range(27):
                if k != j:
                    f[i][j] = min(f[i][j], f[i-1][k])

        return min(f[n-1])


if __name__ == '__main__':
    print(Solution().minCost(s="abaac", cost=[1,2,3,4,5]))