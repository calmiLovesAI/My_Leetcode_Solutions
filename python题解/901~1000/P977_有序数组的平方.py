
from typing import List


# 排序
class Solution:
    def sortedSquares(self, A: List[int]) -> List[int]:
        ans = [pow(x, 2) for x in A]
        ans.sort()
        return ans

# 双指针
class Solution2:
    def sortedSquares(self, A: List[int]) -> List[int]:
        n = len(A)
        ans = [0 for _ in range(n)]

        i, j, pos = 0, n-1, n-1

        while i <= j:
            a = pow(A[i], 2)
            b = pow(A[j], 2)
            if a > b:
                ans[pos] = a
                i += 1
            else:
                ans[pos] = b
                j -= 1
            pos -= 1

        return ans