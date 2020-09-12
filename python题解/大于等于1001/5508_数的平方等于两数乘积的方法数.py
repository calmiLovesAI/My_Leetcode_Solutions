# https://leetcode-cn.com/problems/number-of-ways-where-square-of-number-is-equal-to-product-of-two-numbers/

from typing import List
from collections import defaultdict

class Solution:
    def count(self, a_list, b_list):
        res = 0
        d = defaultdict(int)
        for item in a_list:
            d[item*item] += 1
        for j in range(len(b_list)):
            for k in range(j+1, len(b_list)):
                res += d[b_list[j]*b_list[k]]
        return res

    def numTriplets(self, nums1: List[int], nums2: List[int]) -> int:
        return self.count(nums1, nums2) + self.count(nums2, nums1)


if __name__ == '__main__':
    print(Solution().numTriplets(nums1=[7, 7, 8, 3], nums2=[1, 2, 9, 7]))