# https://leetcode-cn.com/problems/er-jin-zhi-zhong-1de-ge-shu-lcof/

from collections import Counter


class Solution:
    def hammingWeight(self, n: int) -> int:
        # 统计除以2的余数中有多少个1就行
        # ans = 0
        # while n:
        #     a = n % 2
        #     if a == 1:
        #         ans += 1
        #     n = n // 2


        # 还可以直接使用Python内置函数
        ans = Counter(bin(n)[2:])["1"]
        return ans



if __name__ == '__main__':
    print(Solution().hammingWeight(n=9))