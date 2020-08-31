# https://leetcode-cn.com/problems/bitwise-and-of-numbers-range/

# 问题重新表述为：给定两个整数，我们要找到它们对应的二进制字符串的公共前缀。


class Solution:
    def rangeBitwiseAnd(self, m: int, n: int) -> int:
        shift = 0
        while m < n:
            m = m >> 1
            n = n >> 1
            shift += 1
        return m << shift



if __name__ == "__main__":
    print(Solution().rangeBitwiseAnd(m=0, n=1))
