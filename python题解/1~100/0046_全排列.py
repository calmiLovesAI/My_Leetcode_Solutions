# https://leetcode-cn.com/problems/permutations/

from typing import List
from copy import deepcopy


class Solution:
    def __init__(self):
        self.cur_pmt = []
        self.res_pmt = []
        self.n = 0
        self.state = []

    def permute(self, nums: List[int]) -> List[List[int]]:
        self.n = len(nums)
        self.state.extend([True] * self.n)
        self.dfs(nums, 0)
        return self.res_pmt

    def dfs(self, nums, k):
        if k == self.n:
            self.res_pmt.append(deepcopy(self.cur_pmt))  # 注意，需要深拷贝
            return
        for i in range(self.n):
            if self.state[i]:
                self.state[i] = False
                self.cur_pmt.append(nums[i])
                self.dfs(nums, k+1)
                self.cur_pmt.pop()
                self.state[i] = True


if __name__ == '__main__':
    print(Solution().permute([1, 2, 3]))