# https://leetcode-cn.com/problems/shu-zhi-de-zheng-shu-ci-fang-lcof/



class Solution:
    def myPow(self, x: float, n: int) -> float:
        ans = 1
        if n == 0:
            return ans
        if n > 0:
            while n:
                ans *= x
                n -= 1
            return ans
        if n < 0:
            while n:
                ans *= x
                n -= 1
            return 1/ans if ans != 0 else 0


if __name__ == '__main__':
    print(Solution().myPow(x=3.14, n=3))