# https://leetcode-cn.com/problems/longest-uncommon-subsequence-ii/


from typing import List


class Solution:
    def isSubsequence(self, x, y):
        # 判断x是不是y的子串
        i = j = 0
        while i < len(x) and j < len(y):
            if x[i] == y[j]:
                i += 1
            j += 1

        return i == len(x)

    def findLUSlength(self, strs: List[str]) -> int:
        n = len(strs)
        strs_sorted = sorted(strs, key=lambda x:len(x), reverse=True)
        i = 0
        while i < n:
            flag = True
            j = 0
            while j < n:
                if i!=j and self.isSubsequence(strs_sorted[i], strs_sorted[j]):
                    # 字符串strs_sorted[i]是strs_sorted[j]的子串
                    flag = False
                j += 1
            if flag:
                return len(strs_sorted[i])
            i += 1
        return -1




if __name__ == '__main__':
    print(Solution().findLUSlength(strs=["aaa","aaa","aa"]))