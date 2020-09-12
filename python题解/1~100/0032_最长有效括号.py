



class Solution:

    def l2r(self, s, char2num):
        n = len(s)
        i = j = 0
        t = 0
        l_valid = 0
        while i<=j and i < n and j < n:
            t += char2num[s[j]]
            if t < 0:
                j += 1
                i = j
                t = 0
            elif t == 0:
                l_valid = max(l_valid, j-i+1)
                j += 1
            else:
                j += 1
        return l_valid
    

    def longestValidParentheses(self, s: str) -> int:
        # 一次正序，一次逆序，取最大值
        return max(self.l2r(s, {"(": 1, ")": -1}), self.l2r(s[::-1], {"(": -1, ")": 1}))





if __name__ == "__main__":
    print(Solution().longestValidParentheses(s="(()))())("))