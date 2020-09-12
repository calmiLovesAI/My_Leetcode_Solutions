# https://leetcode-cn.com/problems/triangle/
from typing import List
import math


class Solution:
    def minimumTotal(self, triangle: List[List[int]]) -> int:
        n = len(triangle)
        # 三角形的第i行有i+1个元素，于是，
        # 可以设dp(i, j)表示到达第i行，第j列位置的所有路径的最小值
        dp = [[math.inf for _ in range(n)] for _ in range(n)]
        dp[0][0] = triangle[0][0]

        for i in range(1, n):
            for j in range(i+1):
                # 第i行只有索引为0~i的位置是有值的，其他的都是math.inf
                if j == 0:
                    dp[i][j] = dp[i-1][j] + triangle[i][j]
                else:
                    dp[i][j] = min(dp[i-1][j] + triangle[i][j], dp[i-1][j-1] + triangle[i][j])

        return int(min(dp[n-1]))



if __name__ == '__main__':
    print(Solution().minimumTotal(triangle=[
         [2],
        [3,4],
       [6,5,7],
      [4,1,8,3]
    ]))