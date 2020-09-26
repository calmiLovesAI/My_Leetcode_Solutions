# https://leetcode-cn.com/problems/da-yin-cong-1dao-zui-da-de-nwei-shu-lcof/

from typing import List



class Solution:
    def printNumbers(self, n: int) -> List[int]:
        bound = 0
        while n:
            bound *= 10
            bound += 9
            n -= 1
        ans = []
        for i in range(1, bound+1):
            ans.append(i)
        return ans