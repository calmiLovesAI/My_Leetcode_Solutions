from typing import List
import math

# https://leetcode-cn.com/problems/maximum-length-of-subarray-with-positive-product/

class Solution:
    def getMaxLen(self, nums: List[int]) -> int:
        n = len(nums)
        # f(i)表示以i结尾的乘积为正数的最长子数组的长度
        # g(i)表示以i结尾的乘积为负数的最长子数组的长度
        f = [0 for _ in range(n)]
        g = [0 for _ in range(n)]

        if nums[0] > 0:
            f[0] = 1
        elif nums[0] < 0:
            g[0] = 1

        for i in range(1, n):
            if nums[i] > 0:
                f[i] = f[i-1] + 1
                if g[i-1]:
                    g[i] = g[i-1] + 1
            elif nums[i] < 0:
                if g[i-1]:
                    f[i] = g[i-1] + 1
                g[i] = f[i-1] + 1
        
        return max(f)

if __name__ == "__main__":
    print(Solution().getMaxLen([-16,0,-5,2,2,-13,11,8]))