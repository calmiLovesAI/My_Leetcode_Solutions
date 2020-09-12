
from typing import List
from collections import deque

class Solution:
    def maxSlidingWindow(self, nums: List[int], k: int) -> List[int]:
        # 单调队列
        res = []
        q = deque()
        for i in range(len(nums)):
            if len(q) and i - k + 1 > q[0]:
                q.popleft()
            while len(q) and nums[q[-1]] <= nums[i]:
                q.pop()
            q.append(i)
            if i-k+1 >= 0:
                res.append(nums[q[0]])
        return res




if __name__ == '__main__':
    pass