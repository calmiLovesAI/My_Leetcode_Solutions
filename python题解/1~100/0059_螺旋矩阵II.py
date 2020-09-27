from typing import List


class Solution:
    def generateMatrix(self, n: int) -> List[List[int]]:
        if n == 0:
            return []
        matrix = [[0 for _ in range(n)] for _ in range(n)]
        i = j = 0
        start = 1
        ori = 0
        # 0，1，2，3代表四个前进的方向，0是往右，1是往下，2是往左，3是往上。
        while start <= n**2:
            matrix[i][j] = start
            start += 1
            if ori % 4 == 0:
                if (j+1>=n) or (j+1<n and matrix[i][j+1] != 0):
                    ori += 1
            elif ori % 4 == 1:
                if (i+1>=n) or (i+1<n and matrix[i+1][j] != 0):
                    ori += 1
            elif ori % 4 == 2:
                if (j-1<0) or (j-1>=0 and matrix[i][j-1] != 0):
                    ori += 1
            else:
                if (i-1<0) or (i-1>=0 and matrix[i-1][j] != 0):
                    ori += 1

            if ori % 4 == 0:
                j += 1
            elif ori % 4 == 1:
                i += 1
            elif ori % 4 == 2:
                j -= 1
            else:
                i -= 1
        return matrix


if __name__ == '__main__':
    print(Solution().generateMatrix(n=3))