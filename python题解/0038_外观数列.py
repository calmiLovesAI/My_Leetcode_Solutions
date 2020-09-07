# https://leetcode-cn.com/problems/count-and-say/

from collections import defaultdict


class Solution:
    def get_next(self, s):
        n = len(s)
        if n == 1:
            return "1" + s
        res = ""
        count = 1
        for i in range(1, n):
            if s[i] == s[i-1]:
                count += 1
                if i == n-1:
                    res += str(count) + s[i]

            else:
                res += str(count) + s[i-1]
                count = 1
                if i == n-1:
                    res += str(count) + s[i]
        return res


    def countAndSay(self, n: int) -> str:
        start_s = "1"
        if n == 1:
            return start_s
        else:
            for i in range(1, n):
                start_s = self.get_next(start_s)
            return start_s


if __name__ == '__main__':
    print(Solution().countAndSay(n=5))