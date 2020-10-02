
import math

class Solution:
    def quick_mul(self, x, n):
        ans = 1
        x_c = x
        while n:
            if n%2==1:
                ans *= x_c
            x_c *= x_c
            n = math.floor(n/2)
        return ans

    def myPow(self, x: float, n: int) -> float:
        if n<0:
            return 1.0 / self.quick_mul(x, abs(n))
        else:
            return self.quick_mul(x, n)