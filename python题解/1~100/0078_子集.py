# https://leetcode-cn.com/problems/subsets/


from typing import List
from copy import deepcopy


class Solution:
    def subsets(self, nums: List[int]) -> List[List[int]]:
        n = len(nums)
        res = [[]]
        for i in range(n):
            temp = []
            for item in res:
                temp.append(deepcopy(item) + [nums[i]])
            res.extend(temp)
        return res



if __name__ == '__main__':
    print(Solution().subsets(nums=[1,2,3]))