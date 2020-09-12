# https://leetcode-cn.com/problems/largest-rectangle-in-histogram/

from typing import List
from collections import deque


class Solution:
    def largestRectangleArea(self, heights: List[int]) -> int:
        # 单调栈
        n = len(heights)
        border_left, border_right = [0 for _ in range(n)], [0 for _ in range(n)]
        d = deque()
        for i in range(n):
            while len(d) > 0 and heights[d[-1]] >= heights[i]:
                d.pop()
            if len(d) == 0:
                border_left[i] = -1
            else:
                border_left[i] = d[-1]
            d.append(i)

        d.clear()
        for j in range(n-1, -1, -1):
            while len(d) > 0 and heights[d[-1]] >= heights[j]:
                d.pop()
            if len(d) == 0:
                border_right[j] = n
            else:
                border_right[j] = d[-1]
            d.append(j)

        res = 0
        for k in range(n):
            res = max(res, heights[k] * (border_right[k] - border_left[k] - 1))
        return res


if __name__ == '__main__':
    print(Solution().largestRectangleArea(heights=[2,1,5,6,2,3]))