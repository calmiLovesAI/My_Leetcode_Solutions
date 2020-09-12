# https://leetcode-cn.com/problems/unique-paths-ii/

from typing import List


class Solution:

    def can_approach(self, x):
        return 1 if x == 0 else 0

    def uniquePathsWithObstacles(self, obstacleGrid: List[List[int]]) -> int:
        # 设dp[i][j]表示到达网格坐标(i, j)有多少条路径
        m = len(obstacleGrid)
        n = len(obstacleGrid[0])
        if m==0 or n==0:
            return 0

        dp = [[0 for _ in range(n)] for _ in range(m)]
        for i in range(m):
            for j in range(n):
                if i-1 >= 0 and j-1>=0:
                    dp[i][j] = self.can_approach(obstacleGrid[i][j]) * (dp[i][j-1] + dp[i-1][j])
                elif i-1 < 0 and j-1>=0:
                    dp[i][j] = self.can_approach(obstacleGrid[i][j]) * dp[i][j - 1]
                elif j-1 <0 and i-1>=0:
                    dp[i][j] = self.can_approach(obstacleGrid[i][j]) * dp[i - 1][j]
                else:
                    # i=j=0
                    dp[i][j] = self.can_approach((obstacleGrid[i][j]))

        return dp[m-1][n-1]




if __name__ == '__main__':
    print(Solution().uniquePathsWithObstacles(obstacleGrid=[
      [0,0,0],
      [0,1,0],
      [0,0,0]
    ]))