

class Solution:
    def numWays(self, n: int) -> int:
        if n == 0:
            return 1
        if n == 1:
            return 1
        a = 1
        b = 1
        for i in range(2, n+1):
            ans = int((a + b)%(1e9+7))
            a = b
            b = ans
        return ans