# https://leetcode-cn.com/problems/fei-bo-na-qi-shu-lie-lcof/


class Solution:
    def fib(self, n: int) -> int:
        if n == 0:
            return 0
        if n == 1:
            return 1
        a = 0
        b = 1
        for i in range(2, n+1):
            ans = int((a + b)%(1e9+7))
            a = b
            b = ans
        return ans


if __name__ == '__main__':
    print(Solution().fib(n=2))