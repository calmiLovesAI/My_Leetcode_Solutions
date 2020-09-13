# https://leetcode-cn.com/problems/two-sum/

from typing import List


class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        n = len(nums)
        res = []
        hash_table = {}
        for i in range(n):
            if target-nums[i] in hash_table.keys():
                res.extend([hash_table[target-nums[i]], i])
            else:
                hash_table[nums[i]] = i
        return res



if __name__ == '__main__':
    print(Solution().twoSum(nums=[2, 7, 11, 15], target=9))