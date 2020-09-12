import math

class Solution:
    def reverse(self, x: int) -> int:
        y = abs(x)
        res = 0
        # 取出各个数位, 然后合并成一个整数
        num_list = []
        while y:
            res = res * 10 + y % 10
            y = y // 10
        
        if x < 0:
            res = -res
        if res < -math.pow(2, 31) or res > math.pow(2, 31)-1:
            return 0
        return res


if __name__ == "__main__":
    print(Solution().reverse(x=-120))