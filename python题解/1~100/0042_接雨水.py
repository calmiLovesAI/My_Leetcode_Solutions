# https://leetcode-cn.com/problems/trapping-rain-water/

from typing import List
from collections import deque


class Solution:
    def trap(self, height: List[int]) -> int:
        res = 0
        d = deque()
        for i in range(len(height)):
            last = 0
            while len(d) > 0 and height[d[-1]] <= height[i]:
                t = d[-1]
                d.pop()
                res += (i-t-1) * (height[t] - last)
                last = height[t]
            if len(d) > 0 :
                res += (i - d[-1] - 1) * (height[i] - last)
            d.append(i)
        return res


if __name__ == '__main__':
    print(Solution().trap(height=[0,1,0,2,1,0,1,3,2,1,2,1]))