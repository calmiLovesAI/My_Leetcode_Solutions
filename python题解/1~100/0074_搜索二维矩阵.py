from typing import List
import math
# https://leetcode-cn.com/problems/search-a-2d-matrix/

class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        if not matrix:
            return False
        elif not matrix[0]:
            return False
        n = len(matrix)    # 行
        m = len(matrix[0])  # 列
        l, r = 0, n*m-1
        while l < r:
            mid = math.floor((l+r) / 2)
            if matrix[mid//m][mid%m] >= target:
                r = mid
            else:
                l = mid + 1
        if matrix[l//m][l%m] == target:
            return True
        else:
            return False



if __name__ == "__main__":
    print(Solution().searchMatrix(matrix=[
        [1,   3,  5,  7],
        [10, 11, 16, 20],
        [23, 30, 34, 50]
    ], target=3))