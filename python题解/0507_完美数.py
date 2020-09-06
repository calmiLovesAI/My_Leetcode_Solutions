# https://leetcode-cn.com/problems/perfect-number/


import math

class Solution:
    def checkPerfectNumber(self, num: int) -> bool:
        if num == 1 or num <= 0:
            return False
        factors = []
        for i in range(1, math.ceil(pow(num, 0.5))):
            if num % i == 0:
                factors.append(i)
                factors.append(num//i)
        factors.remove(num)

        sum = 0
        for f in factors:
            sum += f
        if sum == num:
            return True
        else:
            return False



if __name__ == '__main__':
    print(Solution().checkPerfectNumber(num=1))