# https://leetcode-cn.com/problems/decode-ways/


class Solution:
    def numDecodings(self, s: str) -> int:
        n = len(s)
        # 设dp[i]：0~i这些字符解码的方法数量
        dp = [0 for _ in range(n)]
        # 初始化
        if s[0] != '0':
            dp[0] = 1
        for i in range(1, n):
            if s[i] != '0':
                dp[i] += dp[i-1]
            if i == 1:
                temp = int(s[:2])
                if 10<=temp<=26:
                    dp[i] += 1
            if i>=2:
                temp = int(s[i-1:i+1])
                if 10<=temp<=26:
                    dp[i] += dp[i-2]

        return dp[-1]



if __name__ == '__main__':
    print(Solution().numDecodings(s="226"))