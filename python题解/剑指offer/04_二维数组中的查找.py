
# https://leetcode-cn.com/problems/er-wei-shu-zu-zhong-de-cha-zhao-lcof/


from typing import List


class Solution:
    def findNumberIn2DArray(self, matrix: List[List[int]], target: int) -> bool:
        # m 行 n 列

        if not matrix or not matrix[0]:
            return False
        m = len(matrix)
        n = len(matrix[0])
        x0 = 0
        y0 = n-1

        while y0 >= 0 and x0 < m:
            if matrix[x0][y0] == target:
                return True
            elif matrix[x0][y0] > target:
                y0 -= 1
            elif matrix[x0][y0] < target:
                x0 += 1
        return False



if __name__ == '__main__':
    print(Solution().findNumberIn2DArray(matrix=[

          [1,   4,  7, 11, 15],
          [2,   5,  8, 12, 19],
          [3,   6,  9, 16, 22],
          [10, 13, 14, 17, 24],
          [18, 21, 23, 26, 30]
        ], target=20))