# https://leetcode-cn.com/problems/longest-uncommon-subsequence-i/


class Solution:
    def findLUSlength(self, a: str, b: str) -> int:
        if a == b:
            return -1
        else:
            return max(len(a), len(b))


if __name__ == '__main__':
    print(Solution().findLUSlength(a="aba", b="cdc"))