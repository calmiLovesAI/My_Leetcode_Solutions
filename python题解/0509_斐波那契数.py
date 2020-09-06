# https://leetcode-cn.com/problems/fibonacci-number/submissions/


class Solution:
    def fib(self, N: int) -> int:
        if N == 0:
            return 0
        elif N == 1:
            return 1

        res = 0
        a = 0
        b = 1
        for i in range(2, N+1):
            res = a + b
            a = b
            b = res
        return res


if __name__ == '__main__':
    print(Solution().fib(N=3))